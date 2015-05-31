Ext.define('CarCatalog.view.SearchCarView', {
	extend: 'Ext.form.Panel',
	alias: 'widget.searchCarView',
	bodyPadding: 10,
	items: [
	 {
		 xtype: 'textfield',
		 name: 'search',
		 fieldLabel: 'Введите название модели',
		 maxLength: 200
	 }
	] 
});