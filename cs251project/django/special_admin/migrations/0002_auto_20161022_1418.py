# -*- coding: utf-8 -*-
# Generated by Django 1.10 on 2016-10-22 14:18
from __future__ import unicode_literals

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('special_admin', '0001_initial'),
    ]

    operations = [
        migrations.AlterField(
            model_name='course',
            name='name',
            field=models.CharField(max_length=50),
        ),
    ]