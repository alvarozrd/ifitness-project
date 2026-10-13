export class User {
  id?: number;
  name = '';
  email = '';
  password = '';
  birthDate = '';
  gender = '';
  active = true;

  static toJson(user: User) {
    return {
      name: user.name,
      email: user.email,
      password: user.password,
      birthDate: User.formatDate(user.birthDate),
      gender: user.gender,
      active: user.active
    };
  }

  private static formatDate(date: string): string | null {
    if (!date) {
      return null;
    }
    return date.split('-').reverse().join('/');
  }
}
