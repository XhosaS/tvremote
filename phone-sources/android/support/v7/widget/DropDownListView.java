package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.graphics.drawable.DrawableWrapperCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.videos.R;
import defpackage.cxe;
import defpackage.czv;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
class DropDownListView extends ListView {
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;
    private cxe mClickAnimation;
    private boolean mDrawsInPressedState;
    private boolean mHijackFocus;
    private boolean mListSelectionHidden;
    private int mMotionPosition;
    ResolveHoverRunnable mResolveHoverRunnable;
    private czv mScrollHelper;
    private int mSelectionBottomPadding;
    private int mSelectionLeftPadding;
    private int mSelectionRightPadding;
    private int mSelectionTopPadding;
    private GateKeeperDrawable mSelector;
    private final Rect mSelectorRect;

    /* compiled from: PG */
    class Api21Impl {
        private Api21Impl() {
        }

        static void drawableHotspotChanged(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* compiled from: PG */
    class Api30Impl {
        private static boolean sHasMethods;
        private static Method sPositionSelector;
        private static Method sSetNextSelectedPositionInt;
        private static Method sSetSelectedPositionInt;

        static {
            try {
                Class cls = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", Integer.TYPE, View.class, Boolean.TYPE, cls, cls);
                sPositionSelector = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", Integer.TYPE);
                sSetSelectedPositionInt = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", Integer.TYPE);
                sSetNextSelectedPositionInt = declaredMethod3;
                declaredMethod3.setAccessible(true);
                sHasMethods = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        private Api30Impl() {
        }

        static boolean canPositionSelectorForHoveredItem() {
            return sHasMethods;
        }

        static void positionSelectorForHoveredItem(DropDownListView dropDownListView, int i, View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                Method method = sPositionSelector;
                Integer numValueOf = Integer.valueOf(i);
                method.invoke(dropDownListView, numValueOf, view, false, -1, -1);
                sSetSelectedPositionInt.invoke(dropDownListView, numValueOf);
                sSetNextSelectedPositionInt.invoke(dropDownListView, numValueOf);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* compiled from: PG */
    class Api33Impl {
        private Api33Impl() {
        }

        static boolean isSelectedChildViewEnabled(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void setSelectedChildViewEnabled(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* compiled from: PG */
    class GateKeeperDrawable extends DrawableWrapperCompat {
        private boolean mEnabled;

        public GateKeeperDrawable(Drawable drawable) {
            super(drawable);
            this.mEnabled = true;
        }

        @Override // android.support.v7.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.mEnabled) {
                super.draw(canvas);
            }
        }

        public void setEnabled(boolean z) {
            this.mEnabled = z;
        }

        @Override // android.support.v7.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.mEnabled) {
                super.setHotspot(f, f2);
            }
        }

        @Override // android.support.v7.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.mEnabled) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // android.support.v7.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.mEnabled) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // android.support.v7.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.mEnabled) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* compiled from: PG */
    class PreApi33Impl {
        private static final Field sIsChildViewEnabled;

        static {
            NoSuchFieldException e;
            Field declaredField;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            } catch (NoSuchFieldException e2) {
                e = e2;
                declaredField = null;
            }
            try {
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                e = e3;
                e.printStackTrace();
                sIsChildViewEnabled = declaredField;
            }
            sIsChildViewEnabled = declaredField;
        }

        private PreApi33Impl() {
        }

        static boolean isSelectedChildViewEnabled(AbsListView absListView) {
            Field field = sIsChildViewEnabled;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return false;
            }
        }

        static void setSelectedChildViewEnabled(AbsListView absListView, boolean z) throws IllegalAccessException, IllegalArgumentException {
            Field field = sIsChildViewEnabled;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* compiled from: PG */
    class ResolveHoverRunnable implements Runnable {
        public ResolveHoverRunnable() {
        }

        public void cancel() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.mResolveHoverRunnable = null;
            dropDownListView.removeCallbacks(this);
        }

        public void post() {
            DropDownListView.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.mResolveHoverRunnable = null;
            dropDownListView.drawableStateChanged();
        }
    }

    public DropDownListView(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.mSelectorRect = new Rect();
        this.mSelectionLeftPadding = 0;
        this.mSelectionTopPadding = 0;
        this.mSelectionRightPadding = 0;
        this.mSelectionBottomPadding = 0;
        this.mHijackFocus = z;
        setCacheColorHint(0);
    }

    private void clearPressedItem() {
        this.mDrawsInPressedState = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.mMotionPosition - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        cxe cxeVar = this.mClickAnimation;
        if (cxeVar != null) {
            cxeVar.a();
            this.mClickAnimation = null;
        }
    }

    private void clickPressedItem(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    private void drawSelectorCompat(Canvas canvas) {
        Drawable selector;
        if (this.mSelectorRect.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.mSelectorRect);
        selector.draw(canvas);
    }

    private void positionSelectorCompat(int i, View view) throws IllegalAccessException, IllegalArgumentException {
        Rect rect = this.mSelectorRect;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.mSelectionLeftPadding;
        rect.top -= this.mSelectionTopPadding;
        rect.right += this.mSelectionRightPadding;
        rect.bottom += this.mSelectionBottomPadding;
        boolean zSuperIsSelectedChildViewEnabled = superIsSelectedChildViewEnabled();
        if (view.isEnabled() != zSuperIsSelectedChildViewEnabled) {
            superSetSelectedChildViewEnabled(!zSuperIsSelectedChildViewEnabled);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    private void positionSelectorLikeFocusCompat(int i, View view) throws IllegalAccessException, IllegalArgumentException {
        boolean z;
        Drawable selector = getSelector();
        if (selector == null) {
            z = false;
        } else if (i != -1) {
            z = true;
        } else {
            i = -1;
            z = false;
        }
        if (z) {
            selector.setVisible(false, false);
        }
        positionSelectorCompat(i, view);
        if (z) {
            Rect rect = this.mSelectorRect;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            selector.setHotspot(fExactCenterX, fExactCenterY);
        }
    }

    private void positionSelectorLikeTouchCompat(int i, View view, float f, float f2) throws IllegalAccessException, IllegalArgumentException {
        positionSelectorLikeFocusCompat(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        selector.setHotspot(f, f2);
    }

    private void setPressedItem(View view, int i, float f, float f2) throws IllegalAccessException, IllegalArgumentException {
        View childAt;
        this.mDrawsInPressedState = true;
        Api21Impl.drawableHotspotChanged(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.mMotionPosition;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.mMotionPosition = i;
        Api21Impl.drawableHotspotChanged(view, f - view.getLeft(), f2 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        positionSelectorLikeTouchCompat(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private void setSelectorEnabled(boolean z) {
        GateKeeperDrawable gateKeeperDrawable = this.mSelector;
        if (gateKeeperDrawable != null) {
            gateKeeperDrawable.setEnabled(z);
        }
    }

    private boolean superIsSelectedChildViewEnabled() {
        return Build.VERSION.SDK_INT >= 33 ? Api33Impl.isSelectedChildViewEnabled(this) : PreApi33Impl.isSelectedChildViewEnabled(this);
    }

    private void superSetSelectedChildViewEnabled(boolean z) throws IllegalAccessException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.setSelectedChildViewEnabled(this, z);
        } else {
            PreApi33Impl.setSelectedChildViewEnabled(this, z);
        }
    }

    private boolean touchModeDrawsInPressedStateCompat() {
        return this.mDrawsInPressedState;
    }

    private void updateSelectorStateCompat() {
        Drawable selector = getSelector();
        if (selector != null && touchModeDrawsInPressedStateCompat() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        drawSelectorCompat(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.mResolveHoverRunnable != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        updateSelectorStateCompat();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.mHijackFocus || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.mHijackFocus || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.mHijackFocus || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.mHijackFocus && this.mListSelectionHidden) || super.isInTouchMode();
    }

    public int lookForSelectablePosition(int i, boolean z) {
        ListAdapter adapter = getAdapter();
        if (adapter == null || isInTouchMode()) {
            return -1;
        }
        int count = adapter.getCount();
        if (!getAdapter().areAllItemsEnabled()) {
            if (z) {
                i = Math.max(0, i);
                while (i < count && !adapter.isEnabled(i)) {
                    i++;
                }
            } else {
                i = Math.min(i, count - 1);
                while (i >= 0 && !adapter.isEnabled(i)) {
                    i--;
                }
            }
        }
        if (i < 0 || i >= count) {
            return -1;
        }
        return i;
    }

    public int measureHeightOfChildrenCompat(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop() + getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        View view = null;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            int i9 = itemViewType != i7 ? itemViewType : i7;
            if (itemViewType != i7) {
                view = null;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            view.measure(i, layoutParams.height > 0 ? View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                listPaddingTop += dividerHeight;
            }
            listPaddingTop += view.getMeasuredHeight();
            if (listPaddingTop >= i4) {
                return (i5 < 0 || i6 <= i5 || i8 <= 0 || listPaddingTop == i4) ? i4 : i8;
            }
            if (i5 >= 0 && i6 >= i5) {
                i8 = listPaddingTop;
            }
            i6++;
            i7 = i9;
        }
        return listPaddingTop;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.mResolveHoverRunnable = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onForwardedEvent(android.view.MotionEvent r8, int r9) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = r1
            r3 = r2
            goto L46
        L11:
            r9 = r1
            r3 = r9
            goto L46
        L14:
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r2
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.setPressedItem(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.clickPressedItem(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.clearPressedItem()
        L4d:
            if (r3 == 0) goto L65
            czv r9 = r7.mScrollHelper
            if (r9 != 0) goto L5a
            czv r9 = new czv
            r9.<init>(r7)
            r7.mScrollHelper = r9
        L5a:
            czv r9 = r7.mScrollHelper
            r9.e(r2)
            czv r9 = r7.mScrollHelper
            r9.onTouch(r7, r8)
            return r3
        L65:
            czv r8 = r7.mScrollHelper
            if (r8 == 0) goto L6c
            r8.e(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.DropDownListView.onForwardedEvent(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10) {
            if (this.mResolveHoverRunnable == null) {
                ResolveHoverRunnable resolveHoverRunnable = new ResolveHoverRunnable();
                this.mResolveHoverRunnable = resolveHoverRunnable;
                resolveHoverRunnable.post();
            }
            actionMasked = 10;
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (Build.VERSION.SDK_INT < 30 || !Api30Impl.canPositionSelectorForHoveredItem()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    Api30Impl.positionSelectorForHoveredItem(this, iPointToPosition, childAt);
                }
            }
            updateSelectorStateCompat();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.mMotionPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        ResolveHoverRunnable resolveHoverRunnable = this.mResolveHoverRunnable;
        if (resolveHoverRunnable != null) {
            resolveHoverRunnable.cancel();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.mListSelectionHidden = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        GateKeeperDrawable gateKeeperDrawable = drawable != null ? new GateKeeperDrawable(drawable) : null;
        this.mSelector = gateKeeperDrawable;
        super.setSelector(gateKeeperDrawable);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.mSelectionLeftPadding = rect.left;
        this.mSelectionTopPadding = rect.top;
        this.mSelectionRightPadding = rect.right;
        this.mSelectionBottomPadding = rect.bottom;
    }
}
