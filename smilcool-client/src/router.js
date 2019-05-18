import Vue from 'vue';
import Router from 'vue-router';
import Home from './views/Home.vue';

Vue.use(Router);

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
      children: [
        {
          path: 'article',
          name: 'article',
          component: () => import('@/views/article/Main'),
        }, {
          path: 'article/editor',
          name: 'article-editor',
          component: () => import('@/views/article/Editor')
        }, {
          path: 'article/:id',
          name: 'viewer',
          component: () => import('@/views/article/Viewer'),
          props: true
        }, {
          path: 'moment',
          name: 'moment',
          component: () => import('@/views/moment/Moment')
        }, {
          path: 'file',
          name: 'file',
          component: () => import('@/views/file/File')
        }, {
          path: 'second-hand',
          name: 'second-hand',
          component: () => import('@/views/second-hand/SecondHand')
        }, {
          path: 'lost-found',
          name: 'lost-found',
          component: () => import('@/views/lost-found/LostFound')
        }, {
          path: 'forum',
          name: 'forum',
          component: () => import('@/views/forum/Forum')
        }
      ]
    }
  ]
});
