export class User {
    
        num: Number
        salary: Number
        userName: String

    /* constructor() {

        this.num = 23
        this.salary = 34.988
        this.userName = 'sdfsfsString'
    }
 */
    constructor(id: number, name: string, income:Number){ 
              
        this.num = id
        this.salary= income
        this.userName= name
    }
     
  private update(newName:string): boolean {
    return  true
 }

 public work(newName:string): string {
    return  'workDone'
 }
 protected derivedWork(newName:string): string {
    return  'derived'
 }
   getNewData(id:number): Number {
     return 1234;
 }

}
