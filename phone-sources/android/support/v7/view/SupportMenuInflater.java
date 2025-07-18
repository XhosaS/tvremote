package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.support.v7.appcompat.R;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuItemWrapperICS;
import android.support.v7.widget.DrawableUtils;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import defpackage.cth;
import defpackage.cti;
import defpackage.cur;
import defpackage.cwk;
import defpackage.fb;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SupportMenuInflater extends MenuInflater {
    static final Class<?>[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE;
    static final Class<?>[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
    static final String LOG_TAG = "SupportMenuInflater";
    static final int NO_ID = 0;
    private static final String XML_GROUP = "group";
    private static final String XML_ITEM = "item";
    private static final String XML_MENU = "menu";
    final Object[] mActionProviderConstructorArguments;
    final Object[] mActionViewConstructorArguments;
    Context mContext;
    private Object mRealOwner;

    /* compiled from: PG */
    class InflatedOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] PARAM_TYPES = {MenuItem.class};
        private Method mMethod;
        private Object mRealOwner;

        public InflatedOnMenuItemClickListener(Object obj, String str) {
            this.mRealOwner = obj;
            Class<?> cls = obj.getClass();
            try {
                this.mMethod = cls.getMethod(str, PARAM_TYPES);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                if (this.mMethod.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.mMethod.invoke(this.mRealOwner, menuItem)).booleanValue();
                }
                this.mMethod.invoke(this.mRealOwner, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* compiled from: PG */
    class MenuState {
        private static final int defaultGroupId = 0;
        private static final int defaultItemCategory = 0;
        private static final int defaultItemCheckable = 0;
        private static final boolean defaultItemChecked = false;
        private static final boolean defaultItemEnabled = true;
        private static final int defaultItemId = 0;
        private static final int defaultItemOrder = 0;
        private static final boolean defaultItemVisible = true;
        private int groupCategory;
        private int groupCheckable;
        private boolean groupEnabled;
        private int groupId;
        private int groupOrder;
        private boolean groupVisible;
        cur itemActionProvider;
        private String itemActionProviderClassName;
        private String itemActionViewClassName;
        private int itemActionViewLayout;
        private boolean itemAdded;
        private int itemAlphabeticModifiers;
        private char itemAlphabeticShortcut;
        private int itemCategoryOrder;
        private int itemCheckable;
        private boolean itemChecked;
        private CharSequence itemContentDescription;
        private boolean itemEnabled;
        private int itemIconResId;
        private ColorStateList itemIconTintList = null;
        private PorterDuff.Mode itemIconTintMode = null;
        private int itemId;
        private String itemListenerMethodName;
        private int itemNumericModifiers;
        private char itemNumericShortcut;
        private int itemShowAsAction;
        private CharSequence itemTitle;
        private CharSequence itemTitleCondensed;
        private CharSequence itemTooltipText;
        private boolean itemVisible;
        private Menu menu;

        public MenuState(Menu menu) {
            this.menu = menu;
            resetGroup();
        }

        private char getShortcut(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T newInstance(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, defaultItemChecked, SupportMenuInflater.this.mContext.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w(SupportMenuInflater.LOG_TAG, "Cannot instantiate class: ".concat(String.valueOf(str)), e);
                return null;
            }
        }

        private void setItem(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            MenuItem enabled = menuItem.setChecked(this.itemChecked).setVisible(this.itemVisible).setEnabled(this.itemEnabled);
            int i = this.itemCheckable;
            boolean z = defaultItemChecked;
            enabled.setCheckable(i > 0).setTitleCondensed(this.itemTitleCondensed).setIcon(this.itemIconResId);
            int i2 = this.itemShowAsAction;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.itemListenerMethodName != null) {
                if (SupportMenuInflater.this.mContext.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new InflatedOnMenuItemClickListener(SupportMenuInflater.this.getRealOwner(), this.itemListenerMethodName));
            }
            if (this.itemCheckable >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    ((MenuItemImpl) menuItem).setExclusiveCheckable(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).setExclusiveCheckable(true);
                }
            }
            String str = this.itemActionViewClassName;
            if (str != null) {
                menuItem.setActionView((View) newInstance(str, SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, SupportMenuInflater.this.mActionViewConstructorArguments));
                z = true;
            }
            int i3 = this.itemActionViewLayout;
            if (i3 > 0) {
                if (z) {
                    Log.w(SupportMenuInflater.LOG_TAG, "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i3);
                }
            }
            cur curVar = this.itemActionProvider;
            if (curVar != null) {
                cwk.h(menuItem, curVar);
            }
            cwk.g(menuItem, this.itemContentDescription);
            CharSequence charSequence = this.itemTooltipText;
            boolean z2 = menuItem instanceof cti;
            if (z2) {
                ((cti) menuItem).setTooltipText(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence);
            }
            char c = this.itemAlphabeticShortcut;
            int i4 = this.itemAlphabeticModifiers;
            if (z2) {
                ((cti) menuItem).setAlphabeticShortcut(c, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c, i4);
            }
            char c2 = this.itemNumericShortcut;
            int i5 = this.itemNumericModifiers;
            if (z2) {
                ((cti) menuItem).setNumericShortcut(c2, i5);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c2, i5);
            }
            PorterDuff.Mode mode = this.itemIconTintMode;
            if (mode != null) {
                if (z2) {
                    ((cti) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.itemIconTintList;
            if (colorStateList != null) {
                if (z2) {
                    ((cti) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }

        public void addItem() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.itemAdded = true;
            setItem(this.menu.add(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle));
        }

        public SubMenu addSubMenuItem() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.itemAdded = true;
            SubMenu subMenuAddSubMenu = this.menu.addSubMenu(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle);
            setItem(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean hasAddedItem() {
            return this.itemAdded;
        }

        public void readGroup(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = SupportMenuInflater.this.mContext.obtainStyledAttributes(attributeSet, R.styleable.MenuGroup);
            this.groupId = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            this.groupCategory = typedArrayObtainStyledAttributes.getInt(3, 0);
            this.groupOrder = typedArrayObtainStyledAttributes.getInt(4, 0);
            this.groupCheckable = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.groupVisible = typedArrayObtainStyledAttributes.getBoolean(2, true);
            this.groupEnabled = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_enabled, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void readItem(AttributeSet attributeSet) {
            TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(SupportMenuInflater.this.mContext, attributeSet, R.styleable.MenuItem);
            this.itemId = tintTypedArrayObtainStyledAttributes.getResourceId(2, 0);
            this.itemCategoryOrder = (tintTypedArrayObtainStyledAttributes.getInt(5, this.groupCategory) & (-65536)) | ((char) tintTypedArrayObtainStyledAttributes.getInt(6, this.groupOrder));
            this.itemTitle = tintTypedArrayObtainStyledAttributes.getText(7);
            this.itemTitleCondensed = tintTypedArrayObtainStyledAttributes.getText(8);
            this.itemIconResId = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.MenuItem_android_icon, 0);
            this.itemAlphabeticShortcut = getShortcut(tintTypedArrayObtainStyledAttributes.getString(9));
            this.itemAlphabeticModifiers = tintTypedArrayObtainStyledAttributes.getInt(16, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
            this.itemNumericShortcut = getShortcut(tintTypedArrayObtainStyledAttributes.getString(10));
            this.itemNumericModifiers = tintTypedArrayObtainStyledAttributes.getInt(20, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
            if (tintTypedArrayObtainStyledAttributes.hasValue(11)) {
                this.itemCheckable = tintTypedArrayObtainStyledAttributes.getBoolean(11, defaultItemChecked) ? 1 : 0;
            } else {
                this.itemCheckable = this.groupCheckable;
            }
            this.itemChecked = tintTypedArrayObtainStyledAttributes.getBoolean(3, defaultItemChecked);
            this.itemVisible = tintTypedArrayObtainStyledAttributes.getBoolean(4, this.groupVisible);
            this.itemEnabled = tintTypedArrayObtainStyledAttributes.getBoolean(1, this.groupEnabled);
            this.itemShowAsAction = tintTypedArrayObtainStyledAttributes.getInt(21, -1);
            this.itemListenerMethodName = tintTypedArrayObtainStyledAttributes.getString(12);
            this.itemActionViewLayout = tintTypedArrayObtainStyledAttributes.getResourceId(13, 0);
            this.itemActionViewClassName = tintTypedArrayObtainStyledAttributes.getString(15);
            String string = tintTypedArrayObtainStyledAttributes.getString(14);
            this.itemActionProviderClassName = string;
            if (string == null) {
                this.itemActionProvider = null;
            } else if (this.itemActionViewLayout == 0 && this.itemActionViewClassName == null) {
                this.itemActionProvider = (cur) newInstance(string, SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE, SupportMenuInflater.this.mActionProviderConstructorArguments);
            } else {
                Log.w(SupportMenuInflater.LOG_TAG, "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                this.itemActionProvider = null;
            }
            this.itemContentDescription = tintTypedArrayObtainStyledAttributes.getText(17);
            this.itemTooltipText = tintTypedArrayObtainStyledAttributes.getText(22);
            if (tintTypedArrayObtainStyledAttributes.hasValue(19)) {
                this.itemIconTintMode = DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(19, -1), this.itemIconTintMode);
            } else {
                this.itemIconTintMode = null;
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(18)) {
                this.itemIconTintList = tintTypedArrayObtainStyledAttributes.getColorStateList(18);
            } else {
                this.itemIconTintList = null;
            }
            tintTypedArrayObtainStyledAttributes.recycle();
            this.itemAdded = defaultItemChecked;
        }

        public void resetGroup() {
            this.groupId = 0;
            this.groupCategory = 0;
            this.groupOrder = 0;
            this.groupCheckable = 0;
            this.groupVisible = true;
            this.groupEnabled = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        ACTION_VIEW_CONSTRUCTOR_SIGNATURE = clsArr;
        ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = clsArr;
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.mContext = context;
        Object[] objArr = {context};
        this.mActionViewConstructorArguments = objArr;
        this.mActionProviderConstructorArguments = objArr;
    }

    private Object findRealOwner(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? findRealOwner(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void parseMenu(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        MenuState menuState = new MenuState(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals(XML_MENU)) {
                    throw new RuntimeException("Expecting menu, got ".concat(String.valueOf(name)));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == 2) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    if (name2.equals(XML_GROUP)) {
                        menuState.readGroup(attributeSet);
                    } else if (name2.equals(XML_ITEM)) {
                        menuState.readItem(attributeSet);
                    } else if (name2.equals(XML_MENU)) {
                        parseMenu(xmlPullParser, attributeSet, menuState.addSubMenuItem());
                    } else {
                        str = name2;
                    }
                    z2 = false;
                }
                z2 = true;
            } else if (eventType == 3) {
                String name3 = xmlPullParser.getName();
                if (!z2) {
                    z2 = false;
                } else if (name3.equals(str)) {
                    str = null;
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (name3.equals(XML_GROUP)) {
                    menuState.resetGroup();
                } else if (name3.equals(XML_ITEM)) {
                    if (!menuState.hasAddedItem()) {
                        cur curVar = menuState.itemActionProvider;
                        if (curVar == null || !curVar.hasSubMenu()) {
                            menuState.addItem();
                        } else {
                            menuState.addSubMenuItem();
                        }
                    }
                } else if (name3.equals(XML_MENU)) {
                    z = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    public Object getRealOwner() {
        if (this.mRealOwner == null) {
            this.mRealOwner = findRealOwner(this.mContext);
        }
        return this.mRealOwner;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof cth)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.mContext.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof fb) {
                    fb fbVar = (fb) menu;
                    if (!fbVar.h) {
                        fbVar.u();
                        z = true;
                    }
                }
                parseMenu(layout, attributeSetAsAttributeSet, menu);
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (z) {
                ((fb) menu).t();
            }
            if (layout != null) {
                layout.close();
            }
        }
    }
}
