package android.support.v7.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.graphics.drawable.DrawableContainerCompat;
import android.support.v7.resources.Compatibility;
import android.support.v7.resources.R;
import android.support.v7.widget.ResourceManagerInternal;
import android.util.AttributeSet;
import android.util.StateSet;
import defpackage.crn;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StateListDrawableCompat extends DrawableContainerCompat {
    private static final boolean DEBUG = false;
    private static final String TAG = "StateListDrawableCompat";
    private boolean mMutated;
    private StateListState mStateListState;

    /* compiled from: PG */
    class StateListState extends DrawableContainerCompat.DrawableContainerState {
        int[][] mStateSets;

        public StateListState(StateListState stateListState, StateListDrawableCompat stateListDrawableCompat, Resources resources) {
            super(stateListState, stateListDrawableCompat, resources);
            if (stateListState != null) {
                this.mStateSets = stateListState.mStateSets;
            } else {
                this.mStateSets = new int[getCapacity()][];
            }
        }

        public int addStateSet(int[] iArr, Drawable drawable) {
            int iAddChild = addChild(drawable);
            this.mStateSets[iAddChild] = iArr;
            return iAddChild;
        }

        @Override // android.support.v7.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        public void growArray(int i, int i2) {
            super.growArray(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.mStateSets, 0, iArr, 0, i);
            this.mStateSets = iArr;
        }

        public int indexOfStateSet(int[] iArr) {
            int[][] iArr2 = this.mStateSets;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.support.v7.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        public void mutate() {
            int length = this.mStateSets.length;
            int[][] iArr = new int[length][];
            while (true) {
                length--;
                if (length < 0) {
                    this.mStateSets = iArr;
                    return;
                } else {
                    int[] iArr2 = this.mStateSets[length];
                    iArr[length] = iArr2 != null ? (int[]) iArr2.clone() : null;
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new StateListDrawableCompat(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new StateListDrawableCompat(this, resources);
        }
    }

    public StateListDrawableCompat() {
        this(null, null);
    }

    private void inflateChildElements(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        StateListState stateListState = this.mStateListState;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next2 == 3) {
                return;
            }
            if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayL = crn.l(resources, theme, attributeSet, R.styleable.StateListDrawableItem);
                int resourceId = typedArrayL.getResourceId(R.styleable.StateListDrawableItem_android_drawable, -1);
                Drawable drawable = resourceId > 0 ? ResourceManagerInternal.get().getDrawable(context, resourceId) : null;
                typedArrayL.recycle();
                int[] iArrExtractStateSet = extractStateSet(attributeSet);
                if (drawable == null) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next != 2) {
                        throw new XmlPullParserException(String.valueOf(xmlPullParser.getPositionDescription()).concat(": <item> tag requires a 'drawable' attribute or child tag defining a drawable"));
                    }
                    drawable = Compatibility.Api21Impl.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                }
                stateListState.addStateSet(iArrExtractStateSet, drawable);
            }
        }
    }

    private void updateStateFromTypedArray(TypedArray typedArray) {
        StateListState stateListState = this.mStateListState;
        stateListState.mChangingConfigurations |= Compatibility.Api21Impl.getChangingConfigurations(typedArray);
        int[] iArr = R.styleable.AnimatedStateListDrawableCompat;
        stateListState.mVariablePadding = typedArray.getBoolean(2, stateListState.mVariablePadding);
        stateListState.mConstantSize = typedArray.getBoolean(3, stateListState.mConstantSize);
        stateListState.mEnterFadeDuration = typedArray.getInt(4, stateListState.mEnterFadeDuration);
        stateListState.mExitFadeDuration = typedArray.getInt(5, stateListState.mExitFadeDuration);
        stateListState.mDither = typedArray.getBoolean(R.styleable.StateListDrawable_android_dither, stateListState.mDither);
    }

    public void addState(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.mStateListState.addStateSet(iArr, drawable);
            onStateChange(getState());
        }
    }

    @Override // android.support.v7.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // android.support.v7.graphics.drawable.DrawableContainerCompat
    public void clearMutated() {
        super.clearMutated();
        this.mMutated = DEBUG;
    }

    public int[] extractStateSet(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, DEBUG)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    int getStateCount() {
        return this.mStateListState.getChildCount();
    }

    Drawable getStateDrawable(int i) {
        return this.mStateListState.getChild(i);
    }

    int getStateDrawableIndex(int[] iArr) {
        return this.mStateListState.indexOfStateSet(iArr);
    }

    StateListState getStateListState() {
        return this.mStateListState;
    }

    int[] getStateSet(int i) {
        return this.mStateListState.mStateSets[i];
    }

    public void inflate(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayL = crn.l(resources, theme, attributeSet, R.styleable.StateListDrawable);
        setVisible(typedArrayL.getBoolean(1, true), true);
        updateStateFromTypedArray(typedArrayL);
        updateDensity(resources);
        typedArrayL.recycle();
        inflateChildElements(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    @Override // android.support.v7.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.support.v7.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.mMutated) {
            super.mutate();
            this.mStateListState.mutate();
            this.mMutated = true;
        }
        return this;
    }

    @Override // android.support.v7.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iIndexOfStateSet = this.mStateListState.indexOfStateSet(iArr);
        if (iIndexOfStateSet < 0) {
            iIndexOfStateSet = this.mStateListState.indexOfStateSet(StateSet.WILD_CARD);
        }
        if (selectDrawable(iIndexOfStateSet) || zOnStateChange) {
            return true;
        }
        return DEBUG;
    }

    @Override // android.support.v7.graphics.drawable.DrawableContainerCompat
    public void setConstantState(DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.setConstantState(drawableContainerState);
        if (drawableContainerState instanceof StateListState) {
            this.mStateListState = (StateListState) drawableContainerState;
        }
    }

    public StateListDrawableCompat(StateListState stateListState) {
        if (stateListState != null) {
            setConstantState(stateListState);
        }
    }

    @Override // android.support.v7.graphics.drawable.DrawableContainerCompat
    public StateListState cloneConstantState() {
        return new StateListState(this.mStateListState, this, null);
    }

    public StateListDrawableCompat(StateListState stateListState, Resources resources) {
        setConstantState(new StateListState(stateListState, this, resources));
        onStateChange(getState());
    }
}
