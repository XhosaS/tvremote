package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.LinearLayout;
import defpackage.cww;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "android.support.v7.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    /* compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    /* compiled from: PG */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<LinearLayoutCompat> {
        private int mBaselineAlignedChildIndexId;
        private int mBaselineAlignedId;
        private int mDividerId;
        private int mDividerPaddingId;
        private int mGravityId;
        private int mMeasureWithLargestChildId;
        private int mOrientationId;
        private boolean mPropertiesMapped = false;
        private int mShowDividersId;
        private int mWeightSumId;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.mBaselineAlignedId = propertyMapper.mapBoolean("baselineAligned", R.attr.baselineAligned);
            this.mBaselineAlignedChildIndexId = propertyMapper.mapInt("baselineAlignedChildIndex", R.attr.baselineAlignedChildIndex);
            this.mGravityId = propertyMapper.mapGravity("gravity", R.attr.gravity);
            this.mOrientationId = propertyMapper.mapIntEnum("orientation", R.attr.orientation, new IntFunction<String>() { // from class: android.support.v7.widget.LinearLayoutCompat.InspectionCompanion.1
                @Override // java.util.function.IntFunction
                public String apply(int i) {
                    return i != 0 ? i != 1 ? String.valueOf(i) : "vertical" : "horizontal";
                }
            });
            this.mWeightSumId = propertyMapper.mapFloat("weightSum", R.attr.weightSum);
            this.mDividerId = propertyMapper.mapObject("divider", com.google.android.videos.R.attr.divider);
            this.mDividerPaddingId = propertyMapper.mapInt("dividerPadding", com.google.android.videos.R.attr.dividerPadding);
            this.mMeasureWithLargestChildId = propertyMapper.mapBoolean("measureWithLargestChild", com.google.android.videos.R.attr.measureWithLargestChild);
            this.mShowDividersId = propertyMapper.mapIntFlag("showDividers", com.google.android.videos.R.attr.showDividers, new IntFunction<Set<String>>() { // from class: android.support.v7.widget.LinearLayoutCompat.InspectionCompanion.2
                @Override // java.util.function.IntFunction
                public Set<String> apply(int i) {
                    HashSet hashSet = new HashSet();
                    if (i == 0) {
                        hashSet.add("none");
                        i = 0;
                    }
                    if (i == 1) {
                        hashSet.add("beginning");
                        i = 1;
                    }
                    if (i == 2) {
                        hashSet.add("middle");
                    }
                    if (i == 4) {
                        hashSet.add("end");
                    }
                    return hashSet;
                }
            });
            this.mPropertiesMapped = true;
        }

        public void readProperties(LinearLayoutCompat linearLayoutCompat, PropertyReader propertyReader) {
            if (!this.mPropertiesMapped) {
                throw new InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readBoolean(this.mBaselineAlignedId, linearLayoutCompat.isBaselineAligned());
            propertyReader.readInt(this.mBaselineAlignedChildIndexId, linearLayoutCompat.getBaselineAlignedChildIndex());
            propertyReader.readGravity(this.mGravityId, linearLayoutCompat.getGravity());
            propertyReader.readIntEnum(this.mOrientationId, linearLayoutCompat.getOrientation());
            propertyReader.readFloat(this.mWeightSumId, linearLayoutCompat.getWeightSum());
            propertyReader.readObject(this.mDividerId, linearLayoutCompat.getDividerDrawable());
            propertyReader.readInt(this.mDividerPaddingId, linearLayoutCompat.getDividerPadding());
            propertyReader.readBoolean(this.mMeasureWithLargestChildId, linearLayoutCompat.isMeasureWithLargestChildEnabled());
            propertyReader.readIntFlag(this.mShowDividersId, linearLayoutCompat.getShowDividers());
        }
    }

    /* compiled from: PG */
    public class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2, f);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void forceUniformHeight(int r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
        Lb:
            if (r0 >= r10) goto L3b
            android.view.View r3 = r9.getVirtualChildAt(r0)
            int r1 = r3.getVisibility()
            r2 = 8
            if (r1 == r2) goto L36
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r1 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r1
            int r2 = r1.height
            r4 = -1
            if (r2 != r4) goto L36
            int r8 = r1.width
            int r2 = r3.getMeasuredWidth()
            r1.width = r2
            r5 = 0
            r7 = 0
            r2 = r9
            r4 = r11
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r1.width = r8
            goto L37
        L36:
            r4 = r11
        L37:
            int r0 = r0 + 1
            r11 = r4
            goto Lb
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.forceUniformHeight(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void forceUniformWidth(int r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
        Lb:
            if (r0 >= r10) goto L3b
            android.view.View r3 = r9.getVirtualChildAt(r0)
            int r1 = r3.getVisibility()
            r2 = 8
            if (r1 == r2) goto L36
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r1 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r1
            int r2 = r1.width
            r5 = -1
            if (r2 != r5) goto L36
            int r8 = r1.height
            int r2 = r3.getMeasuredHeight()
            r1.height = r2
            r5 = 0
            r7 = 0
            r2 = r9
            r6 = r11
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r1.height = r8
            goto L37
        L36:
            r6 = r11
        L37:
            int r0 = r0 + 1
            r11 = r6
            goto Lb
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.forceUniformWidth(int, int):void");
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i;
        int virtualChildCount = getVirtualChildCount();
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View virtualChildAt = getVirtualChildAt(i2);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i2)) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, zIsLayoutRtl ? virtualChildAt.getRight() + layoutParams.rightMargin : (virtualChildAt.getLeft() - layoutParams.leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (zIsLayoutRtl) {
                    left = virtualChildAt2.getLeft() - layoutParams2.leftMargin;
                    i = this.mDividerWidth;
                    right = left - i;
                } else {
                    right = virtualChildAt2.getRight() + layoutParams2.rightMargin;
                }
            } else if (zIsLayoutRtl) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.mDividerWidth;
                right = left - i;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LayoutParams) virtualChildAt.getLayoutParams()).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LayoutParams) virtualChildAt2.getLayoutParams()).bottomMargin);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i = this.mGravity & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return bottom + ((LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    protected boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) != 0) {
            do {
                i--;
                if (i >= 0) {
                }
            } while (getChildAt(i).getVisibility() == 8);
            return true;
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void layoutHorizontal(int r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.layoutHorizontal(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void layoutVertical(int r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            int r14 = r14 - r12
            int r12 = r11.getPaddingLeft()
            int r0 = r11.getPaddingRight()
            int r0 = r14 - r0
            int r14 = r14 - r12
            int r1 = r11.getPaddingRight()
            int r14 = r14 - r1
            int r1 = r11.getVirtualChildCount()
            int r2 = r11.mGravity
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L35
            r4 = 80
            if (r3 == r4) goto L2a
            int r13 = r11.getPaddingTop()
            goto L41
        L2a:
            int r3 = r11.getPaddingTop()
            int r3 = r3 + r15
            int r3 = r3 - r13
            int r13 = r11.mTotalLength
            int r13 = r3 - r13
            goto L41
        L35:
            int r3 = r11.getPaddingTop()
            int r15 = r15 - r13
            int r13 = r11.mTotalLength
            int r15 = r15 - r13
            int r15 = r15 / 2
            int r13 = r3 + r15
        L41:
            r15 = 0
        L42:
            if (r15 >= r1) goto Lb9
            android.view.View r4 = r11.getVirtualChildAt(r15)
            r9 = 1
            if (r4 != 0) goto L51
            int r3 = r11.measureNullChild(r15)
            int r13 = r13 + r3
            goto Lb6
        L51:
            int r3 = r4.getVisibility()
            r5 = 8
            if (r3 == r5) goto Lb6
            int r7 = r4.getMeasuredWidth()
            int r8 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            r10 = r3
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r10 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r10
            int r3 = r10.gravity
            if (r3 >= 0) goto L6d
            r3 = r2
        L6d:
            int r5 = r11.getLayoutDirection()
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r5)
            r3 = r3 & 7
            if (r3 == r9) goto L85
            r5 = 5
            if (r3 == r5) goto L80
            int r3 = r10.leftMargin
            int r3 = r3 + r12
            goto L90
        L80:
            int r3 = r0 - r7
            int r5 = r10.rightMargin
            goto L8f
        L85:
            int r3 = r14 - r7
            int r3 = r3 / 2
            int r3 = r3 + r12
            int r5 = r10.leftMargin
            int r3 = r3 + r5
            int r5 = r10.rightMargin
        L8f:
            int r3 = r3 - r5
        L90:
            r5 = r3
            boolean r3 = r11.hasDividerBeforeChildAt(r15)
            if (r3 == 0) goto L9a
            int r3 = r11.mDividerHeight
            int r13 = r13 + r3
        L9a:
            int r3 = r10.topMargin
            int r13 = r13 + r3
            int r3 = r11.getLocationOffset(r4)
            int r6 = r13 + r3
            r3 = r11
            r3.setChildFrame(r4, r5, r6, r7, r8)
            int r5 = r10.bottomMargin
            int r8 = r8 + r5
            int r5 = r11.getNextLocationOffset(r4)
            int r8 = r8 + r5
            int r4 = r11.getChildrenSkipCount(r4, r15)
            int r15 = r15 + r4
            int r13 = r13 + r8
            goto Lb7
        Lb6:
            r3 = r11
        Lb7:
            int r15 = r15 + r9
            goto L42
        Lb9:
            r3 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.layoutVertical(int, int, int, int):void");
    }

    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void measureHorizontal(int r36, int r37) {
        /*
            Method dump skipped, instructions count: 1329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.measureHorizontal(int, int):void");
    }

    public int measureNullChild(int i) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void measureVertical(int r28, int r29) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.measureVertical(int, int):void");
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.mBaselineAlignedChildIndex = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = this.mGravity;
        int i3 = i & 8388615;
        if ((i2 & 8388615) != i3) {
            this.mGravity = i3 | (i2 & (-8388616));
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = this.mGravity;
        int i3 = i2 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int i4 = i & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i3 != i4) {
            this.mGravity = i4 | (i2 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, android.support.v7.appcompat.R.styleable.LinearLayoutCompat, i, 0);
        cww.o(this, context, android.support.v7.appcompat.R.styleable.LinearLayoutCompat, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        int i2 = tintTypedArrayObtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = tintTypedArrayObtainStyledAttributes.getInt(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        if (!tintTypedArrayObtainStyledAttributes.getBoolean(2, true)) {
            setBaselineAligned(false);
        }
        this.mWeightSum = tintTypedArrayObtainStyledAttributes.getFloat(4, -1.0f);
        this.mBaselineAlignedChildIndex = tintTypedArrayObtainStyledAttributes.getInt(3, -1);
        this.mUseLargestChild = tintTypedArrayObtainStyledAttributes.getBoolean(7, false);
        setDividerDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(5));
        this.mShowDividers = tintTypedArrayObtainStyledAttributes.getInt(8, 0);
        this.mDividerPadding = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
