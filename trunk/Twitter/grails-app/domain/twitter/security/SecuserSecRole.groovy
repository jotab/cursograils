package twitter.security

import org.apache.commons.lang.builder.HashCodeBuilder

class SecuserSecRole implements Serializable {

	Secuser secuser
	SecRole secRole

	boolean equals(other) {
		if (!(other instanceof SecuserSecRole)) {
			return false
		}

		other.secuser?.id == secuser?.id &&
			other.secRole?.id == secRole?.id
	}

	int hashCode() {
		def builder = new HashCodeBuilder()
		if (secuser) builder.append(secuser.id)
		if (secRole) builder.append(secRole.id)
		builder.toHashCode()
	}

	static SecuserSecRole get(long secuserId, long secRoleId) {
		find 'from SecuserSecRole where secuser.id=:secuserId and secRole.id=:secRoleId',
			[secuserId: secuserId, secRoleId: secRoleId]
	}

	static SecuserSecRole create(Secuser secuser, SecRole secRole, boolean flush = false) {
		new SecuserSecRole(secuser: secuser, secRole: secRole).save(flush: flush, insert: true)
	}

	static boolean remove(Secuser secuser, SecRole secRole, boolean flush = false) {
		SecuserSecRole instance = SecuserSecRole.findBySecuserAndSecRole(secuser, secRole)
		if (!instance) {
			return false
		}

		instance.delete(flush: flush)
		true
	}

	static void removeAll(Secuser secuser) {
		executeUpdate 'DELETE FROM SecuserSecRole WHERE secuser=:secuser', [secuser: secuser]
	}

	static void removeAll(SecRole secRole) {
		executeUpdate 'DELETE FROM SecuserSecRole WHERE secRole=:secRole', [secRole: secRole]
	}

	static mapping = {
		id composite: ['secRole', 'secuser']
		version false
	}
}
