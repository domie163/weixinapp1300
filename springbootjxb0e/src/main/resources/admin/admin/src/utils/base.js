const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootjxb0e/",
            name: "springbootjxb0e",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootjxb0e/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "微信小程序的点餐系统"
        } 
    }
}
export default base
