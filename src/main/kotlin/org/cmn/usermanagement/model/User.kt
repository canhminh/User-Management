package org.cmn.usermanagement.model

import javax.persistence.Entity

@Entity
class User(val userId: String, val username: String)