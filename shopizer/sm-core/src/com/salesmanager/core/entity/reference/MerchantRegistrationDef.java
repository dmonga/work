/*
 * Licensed to csti consulting 
 * You may obtain a copy of the License at
 *
 * http://www.csticonsulting.com
 * Copyright (c) 2006-Aug 24, 2010 Consultation CS-TI inc. 
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.salesmanager.core.entity.reference;

// Generated Jul 31, 2007 8:23:39 PM by Hibernate Tools 3.2.0.b9

import java.util.Date;

/**
 * MerchantRegistrationDef generated by hbm2java
 */
public class MerchantRegistrationDef implements java.io.Serializable {

	private int merchantRegistrationDefId;
	private int merchantRegistrationDefCode;
	private Date lastModified;
	private Date dateAdded;

	public MerchantRegistrationDef() {
	}

	public MerchantRegistrationDef(int merchantRegistrationDefId,
			int merchantRegistrationDefCode, Date dateAdded) {
		this.merchantRegistrationDefId = merchantRegistrationDefId;
		this.merchantRegistrationDefCode = merchantRegistrationDefCode;
		this.dateAdded = dateAdded;
	}

	public MerchantRegistrationDef(int merchantRegistrationDefId,
			int merchantRegistrationDefCode, Date lastModified, Date dateAdded) {
		this.merchantRegistrationDefId = merchantRegistrationDefId;
		this.merchantRegistrationDefCode = merchantRegistrationDefCode;
		this.lastModified = lastModified;
		this.dateAdded = dateAdded;
	}

	public int getMerchantRegistrationDefId() {
		return this.merchantRegistrationDefId;
	}

	public void setMerchantRegistrationDefId(int merchantRegistrationDefId) {
		this.merchantRegistrationDefId = merchantRegistrationDefId;
	}

	public int getMerchantRegistrationDefCode() {
		return this.merchantRegistrationDefCode;
	}

	public void setMerchantRegistrationDefCode(int merchantRegistrationDefCode) {
		this.merchantRegistrationDefCode = merchantRegistrationDefCode;
	}

	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

}
