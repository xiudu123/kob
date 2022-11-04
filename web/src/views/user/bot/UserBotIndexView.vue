<template>
    <ContentField>
        我的bots
    </ContentField>
</template>

<script>
import ContentField from '@/components/ContentField'
import $ from 'jquery'
import { useStore } from 'vuex' 
export default {
    components:{
        ContentField
    },
    setup(){
        const store = useStore();
        // $.ajax({
        //     url: 'http://127.0.0.1:3000/user/bot/add/',
        //     type: 'post',
        //     data:{
        //         title: "标题",
        //         description: "描述",
        //         content:"代码",
        //     },
        //     headers: {
        //         Authorization: "Bearer " + store.state.user.token,
        //     },
        //     success(resp){
        //         console.log(resp);
        //     },
        //     erroe(resp){
        //         console.log(resp);
        //     }
        // })

        // $.ajax({
        //     url: 'http://127.0.0.1:3000/user/bot/remove/',
        //     type: 'post',
        //     data:{
        //         bot_id: 5,
        //     },
        //     headers: {
        //         Authorization: "Bearer " + store.state.user.token,
        //     },
        //     success(resp){
        //         console.log(resp);
        //     },
        //     erroe(resp){
        //         console.log(resp);
        //     }
        // })

        // $.ajax({
        //     url: 'http://127.0.0.1:3000/user/bot/update/',
        //     type: 'post',
        //     data:{
        //         bot_id: 6,
        //         title: "标题7",
        //         description: "描述7",
        //         content:"代码7",
        //     },
        //     headers: {
        //         Authorization: "Bearer " + store.state.user.token,
        //     },
        //     success(resp){
        //         console.log(resp);
        //     },
        //     erroe(resp){
        //         console.log(resp);
        //     }
        // })

        $.ajax({
            url: 'http://127.0.0.1:3000/user/bot/getlist/',
            type: 'get',
            headers: {
                Authorization: "Bearer " + store.state.user.token,
            },
            success(resp){
                console.log(resp);
            },
            erroe(resp){
                console.log(resp);
            }
        })
    }
}


</script>

<style scoped>

</style>