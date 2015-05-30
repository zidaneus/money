Ext.application({
	name: 'money',
	launch: function () {
		Ext.create('Ext.container.Viewport', {
			layout: 'fit',
			items: {
				xtype: 'panel',
				html: '<h2>Будущий расчет денег</h2>'
			}
		});
	}
});