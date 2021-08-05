package org.uberfire.ext.widgets.common.client.resources;

import org.gwtproject.dom.client.StyleInjector;
import org.gwtproject.i18n.shared.cldr.LocaleInfo;
import org.gwtproject.resources.client.ResourcePrototype;

public class CommonResources_default_InlineClientBundleGenerator implements CommonResources {
  private static CommonResources_default_InlineClientBundleGenerator _instance0 = new CommonResources_default_InlineClientBundleGenerator();
  private void CSSInitializer() {
    CSS = new CommonCss() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "CSS";
      }
      public String getText() {
        return LocaleInfo.getCurrentLocale().isRTL() ? ((".GIYSKH5CPM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GIYSKH5CAN{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getTop() + "px  no-repeat")  + ";height:") + (("4px")  + ";width:" + ("4px")  + ";}.GIYSKH5CJM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GIYSKH5CKM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden") ) + (";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GIYSKH5CIM{border-bottom:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:" + ("3px")  + ";width:" + ("100%")  + ";}.GIYSKH5COM{border-top:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:" + ("3px")  + ";width:" + ("100%")  + ";}.GIYSKH5CMM{border-right:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:") + (("100%")  + ";width:" + ("3px")  + ";}.GIYSKH5CNM{border-left:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:" + ("100%")  + ";width:" + ("3px")  + ";}.GIYSKH5CEM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px") ) + (";}.GIYSKH5CFM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GIYSKH5COL{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getTop() + "px  no-repeat")  + ";height:") + (("4px")  + ";width:" + ("4px")  + ";}.GIYSKH5CPL{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GIYSKH5CNL{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getTop() + "px  repeat-x") ) + (";height:" + ("4px")  + ";width:" + ("100%")  + ";}.GIYSKH5CDM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getTop() + "px  repeat-x")  + ";height:" + ("4px")  + ";width:" + ("100%")  + ";}.GIYSKH5CBM{width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getTop() + "px  repeat-y")  + ";height:") + (("100%")  + ";width:" + ("4px")  + ";}.GIYSKH5CCM{width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getTop() + "px  repeat-y")  + ";height:" + ("100%")  + ";width:" + ("4px")  + ";}.GIYSKH5CAM{background:" + ("#e3e3e3")  + ";}.GIYSKH5CGL{border:" + ("none")  + " !important;width:" + ("95%")  + ";}.GIYSKH5CFL{width:" + ("300px") ) + (";}.GIYSKH5CFL span{padding-right:" + ("15px")  + ";vertical-align:" + ("text-top")  + ";}.GIYSKH5CFL .spinner{margin-top:" + ("-3px")  + ";}.GIYSKH5CGM{height:" + ("32px")  + ";vertical-align:" + ("middle")  + ";display:" + ("table-cell")  + ";}.GIYSKH5CHM{font-size:" + ("smaller")  + ";font-style:" + ("italic")  + ";}.GIYSKH5CJL td div{white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";text-overflow:") + (("ellipsis")  + ";}.GIYSKH5CLL thead th{overflow:" + ("hidden")  + ";text-overflow:" + ("ellipsis")  + ";}.GIYSKH5CKL,.GIYSKH5CML:first-child td{border-top:" + ("none")  + ";}.GIYSKH5CIL{background-color:" + ("#fff")  + ";padding:" + ("5px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#d1d1d1")  + ";z-index:" + ("2000")  + ";}.GIYSKH5CIL .checkbox{margin-top:" + ("2px")  + ";margin-bottom:" + ("2px")  + ";}.btn-file{position:" + ("relative") ) + (";overflow:" + ("hidden")  + ";}.btn-file input[type=\"file\"]{position:" + ("absolute")  + ";top:" + ("0")  + ";left:" + ("0")  + ";min-width:" + ("100%")  + ";min-height:" + ("100%")  + ";font-size:" + ("999px")  + ";text-align:" + ("left")  + ";filter:" + ("alpha(opacity=0)")  + ";opacity:" + ("0")  + ";outline:") + (("none")  + ";background:" + ("white")  + ";cursor:" + ("inherit")  + ";display:" + ("block")  + ";}.btn-file>i+span,.btn-file>span+i{padding-right:" + ("2px")  + ";}")) : ((".GIYSKH5CPM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GIYSKH5CAN{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getTop() + "px  no-repeat")  + ";height:") + (("4px")  + ";width:" + ("4px")  + ";}.GIYSKH5CJM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GIYSKH5CKM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden") ) + (";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GIYSKH5CIM{border-bottom:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:" + ("3px")  + ";width:" + ("100%")  + ";}.GIYSKH5COM{border-top:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:" + ("3px")  + ";width:" + ("100%")  + ";}.GIYSKH5CMM{border-left:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:") + (("100%")  + ";width:" + ("3px")  + ";}.GIYSKH5CNM{border-right:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:" + ("100%")  + ";width:" + ("3px")  + ";}.GIYSKH5CEM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px") ) + (";}.GIYSKH5CFM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GIYSKH5COL{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getTop() + "px  no-repeat")  + ";height:") + (("4px")  + ";width:" + ("4px")  + ";}.GIYSKH5CPL{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GIYSKH5CNL{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getTop() + "px  repeat-x") ) + (";height:" + ("4px")  + ";width:" + ("100%")  + ";}.GIYSKH5CDM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getTop() + "px  repeat-x")  + ";height:" + ("4px")  + ";width:" + ("100%")  + ";}.GIYSKH5CBM{width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getTop() + "px  repeat-y")  + ";height:") + (("100%")  + ";width:" + ("4px")  + ";}.GIYSKH5CCM{width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getTop() + "px  repeat-y")  + ";height:" + ("100%")  + ";width:" + ("4px")  + ";}.GIYSKH5CAM{background:" + ("#e3e3e3")  + ";}.GIYSKH5CGL{border:" + ("none")  + " !important;width:" + ("95%")  + ";}.GIYSKH5CFL{width:" + ("300px") ) + (";}.GIYSKH5CFL span{padding-left:" + ("15px")  + ";vertical-align:" + ("text-top")  + ";}.GIYSKH5CFL .spinner{margin-top:" + ("-3px")  + ";}.GIYSKH5CGM{height:" + ("32px")  + ";vertical-align:" + ("middle")  + ";display:" + ("table-cell")  + ";}.GIYSKH5CHM{font-size:" + ("smaller")  + ";font-style:" + ("italic")  + ";}.GIYSKH5CJL td div{white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";text-overflow:") + (("ellipsis")  + ";}.GIYSKH5CLL thead th{overflow:" + ("hidden")  + ";text-overflow:" + ("ellipsis")  + ";}.GIYSKH5CKL,.GIYSKH5CML:first-child td{border-top:" + ("none")  + ";}.GIYSKH5CIL{background-color:" + ("#fff")  + ";padding:" + ("5px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#d1d1d1")  + ";z-index:" + ("2000")  + ";}.GIYSKH5CIL .checkbox{margin-top:" + ("2px")  + ";margin-bottom:" + ("2px")  + ";}.btn-file{position:" + ("relative") ) + (";overflow:" + ("hidden")  + ";}.btn-file input[type=\"file\"]{position:" + ("absolute")  + ";top:" + ("0")  + ";right:" + ("0")  + ";min-width:" + ("100%")  + ";min-height:" + ("100%")  + ";font-size:" + ("999px")  + ";text-align:" + ("right")  + ";filter:" + ("alpha(opacity=0)")  + ";opacity:" + ("0")  + ";outline:") + (("none")  + ";background:" + ("white")  + ";cursor:" + ("inherit")  + ";display:" + ("block")  + ";}.btn-file>i+span,.btn-file>span+i{padding-left:" + ("2px")  + ";}"));
      }
      public String busyPopup() {
        return "GIYSKH5CFL";
      }
      public String cleanTextArea() {
        return "GIYSKH5CGL";
      }
      public String columnPickerButton() {
        return "GIYSKH5CHL";
      }
      public String columnPickerPopup() {
        return "GIYSKH5CIL";
      }
      public String dataGrid() {
        return "GIYSKH5CJL";
      }
      public String dataGridContent() {
        return "GIYSKH5CKL";
      }
      public String dataGridHeader() {
        return "GIYSKH5CLL";
      }
      public String dataGridRow() {
        return "GIYSKH5CML";
      }
      public String greyBottomClass() {
        return "GIYSKH5CNL";
      }
      public String greyBottomLeftCornerClass() {
        return "GIYSKH5COL";
      }
      public String greyBottomRightCornerClass() {
        return "GIYSKH5CPL";
      }
      public String greyCenterClass() {
        return "GIYSKH5CAM";
      }
      public String greySideLeftClass() {
        return "GIYSKH5CBM";
      }
      public String greySideRightClass() {
        return "GIYSKH5CCM";
      }
      public String greyTopClass() {
        return "GIYSKH5CDM";
      }
      public String greyTopLeftCornerClass() {
        return "GIYSKH5CEM";
      }
      public String greyTopRightCornerClass() {
        return "GIYSKH5CFM";
      }
      public String titleTextCellContainer() {
        return "GIYSKH5CGM";
      }
      public String titleTextCellDescription() {
        return "GIYSKH5CHM";
      }
      public String whiteBottomClass() {
        return "GIYSKH5CIM";
      }
      public String whiteBottomLeftCornerClass() {
        return "GIYSKH5CJM";
      }
      public String whiteBottomRightCornerClass() {
        return "GIYSKH5CKM";
      }
      public String whiteCenterClass() {
        return "GIYSKH5CLM";
      }
      public String whiteSideLeftClass() {
        return "GIYSKH5CMM";
      }
      public String whiteSideRightClass() {
        return "GIYSKH5CNM";
      }
      public String whiteTopClass() {
        return "GIYSKH5COM";
      }
      public String whiteTopLeftCornerClass() {
        return "GIYSKH5CPM";
      }
      public String whiteTopRightCornerClass() {
        return "GIYSKH5CAN";
      }
    }
    ;
  }
  private static class CSSInitializer {
    static {
      _instance0.CSSInitializer();
    }
    static CommonCss get() {
      return CSS;
    }
  }
  public CommonCss CSS() {
    return CSSInitializer.get();
  }
  private void imagesInitializer() {
    images = new CommonImages_default_InlineClientBundleGenerator();
  }
  private static class imagesInitializer {
    static {
      _instance0.imagesInitializer();
    }
    static CommonImages get() {
      return images;
    }
  }
  public CommonImages images() {
    return imagesInitializer.get();
  }
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static CommonCss CSS;
  private static CommonImages images;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      CSS(), 
    };
  }
  public ResourcePrototype getResource(String name) {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<String, ResourcePrototype>();
        resourceMap.put("CSS", CSS());
      }
      return resourceMap.get(name);

  }
}
