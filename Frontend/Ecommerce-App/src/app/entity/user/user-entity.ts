export class UserEntity {
  userId: number;

  firstName: string;

  lastName: string;

  password: string;

  salt: string;

  email: string;

  address: string;

  contact: string;

  isAuthorized: String;

  constructor(
    userId: number,
    firstName: string,
    lastName: string,
    password: string,
    salt: string,
    email: string,
    address: string,
    contact: string,
    isAuthorized: String
  ) {
    this.userId = userId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
    this.salt = salt;
    this.address = address;
    this.email = email;
    this.contact = contact;
    this.isAuthorized = isAuthorized;
  }
}
