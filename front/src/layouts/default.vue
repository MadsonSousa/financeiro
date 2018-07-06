<template>
  <q-layout view="lHh Lpr lFf">
    <q-layout-header>
      <q-toolbar
        color="green"
      >
        <q-btn
          flat
          dense
          round
          @click="leftDrawerOpen = !leftDrawerOpen"
          aria-label="Menu"
        >
          <q-icon name="menu" />
        </q-btn>

        <q-toolbar-title>
          {{ $t('app.name') }}
          <div slot="subtitle">{{ $t('app.description') }}</div>
        </q-toolbar-title>
      </q-toolbar>
    </q-layout-header>

    <q-layout-drawer
      v-model="leftDrawerOpen"
      :content-class="$q.theme === 'mat' ? 'bg-grey-2' : null"
    >
      <q-list
        no-border
        link
        inset-delimiter
      >
        <q-list-header
          class="menu" >{{ $t('general.menu') }}</q-list-header>
        <q-item @click.native="openMenu">
          <q-item-side icon="fas fa-chart-line" />
          <q-item-main :label=" $t('menu.dashboard') " />
        </q-item>
        <q-item @click.native="openMenu">
          <q-item-side icon="fas fa-dollar-sign" />
          <q-item-main :label=" $t('menu.movimentFinancial') " />
        </q-item>
        <q-item @click.native="openMenu">
          <q-item-side icon="fas fa-money-check-alt" />
          <q-item-main :label=" $t('menu.formPayment') " />
        </q-item>
        <q-item @click.native="openMenu">
          <q-item-side icon="fas fa-random" />
          <q-item-main :label=" $t('menu.categories') " />
        </q-item>
      </q-list>
    </q-layout-drawer>

    <q-page-container>
      <router-view />
    </q-page-container>
  </q-layout>
</template>

<script>

export default {
  data () {
    return {
      leftDrawerOpen: this.$q.platform.is.desktop
    }
  },
  methods: {
    openMenu () {
      console.log('teste')
    }
  }
}
</script>

<style>
  .menu {
    background-color: #4b964e;
    color: white;
    margin-top: -8px;
    margin-bottom: 10px;
    min-height: 50px;
    box-shadow: 0 2px 4px -1px rgba(0,0,0,0.2), 0 4px 5px rgba(0,0,0,0.14), 0 1px 10px rgba(0,0,0,0.12);
  }
</style>
