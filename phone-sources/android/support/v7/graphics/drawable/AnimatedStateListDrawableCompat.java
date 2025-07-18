package android.support.v7.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.graphics.drawable.DrawableContainerCompat;
import android.support.v7.graphics.drawable.StateListDrawableCompat;
import android.support.v7.resources.Compatibility;
import android.support.v7.resources.R;
import android.support.v7.widget.ResourceManagerInternal;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import defpackage.crn;
import defpackage.gky;
import defpackage.glh;
import defpackage.jn;
import defpackage.kp;
import defpackage.kq;
import defpackage.ku;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AnimatedStateListDrawableCompat extends StateListDrawableCompat {
    private static final String ELEMENT_ITEM = "item";
    private static final String ELEMENT_TRANSITION = "transition";
    private static final String ITEM_MISSING_DRAWABLE_ERROR = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final String LOGTAG = "AnimatedStateListDrawableCompat";
    private static final String TRANSITION_MISSING_DRAWABLE_ERROR = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final String TRANSITION_MISSING_FROM_TO_ID = ": <transition> tag requires 'fromId' & 'toId' attributes";
    private boolean mMutated;
    private AnimatedStateListState mState;
    private Transition mTransition;
    private int mTransitionFromIndex;
    private int mTransitionToIndex;

    /* compiled from: PG */
    class AnimatableTransition extends Transition {
        private final Animatable mA;

        public AnimatableTransition(Animatable animatable) {
            super();
            this.mA = animatable;
        }

        @Override // android.support.v7.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void start() {
            this.mA.start();
        }

        @Override // android.support.v7.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void stop() {
            this.mA.stop();
        }
    }

    /* compiled from: PG */
    class AnimatedStateListState extends StateListDrawableCompat.StateListState {
        private static final long REVERSED_BIT = 4294967296L;
        private static final long REVERSIBLE_FLAG_BIT = 8589934592L;
        kp<Integer> mStateIds;
        jn<Long> mTransitions;

        public AnimatedStateListState(AnimatedStateListState animatedStateListState, AnimatedStateListDrawableCompat animatedStateListDrawableCompat, Resources resources) {
            super(animatedStateListState, animatedStateListDrawableCompat, resources);
            if (animatedStateListState != null) {
                this.mTransitions = animatedStateListState.mTransitions;
                this.mStateIds = animatedStateListState.mStateIds;
            } else {
                this.mTransitions = new jn<>();
                this.mStateIds = new kp<>();
            }
        }

        private static long generateTransitionKey(int i, int i2) {
            return i2 | (i << 32);
        }

        public int addStateSet(int[] iArr, Drawable drawable, int i) {
            int iAddStateSet = super.addStateSet(iArr, drawable);
            this.mStateIds.h(iAddStateSet, Integer.valueOf(i));
            return iAddStateSet;
        }

        public int addTransition(int i, int i2, Drawable drawable, boolean z) {
            int iAddChild = super.addChild(drawable);
            long j = iAddChild;
            jn<Long> jnVar = this.mTransitions;
            long j2 = true != z ? 0L : REVERSIBLE_FLAG_BIT;
            jnVar.h(generateTransitionKey(i, i2), Long.valueOf(j | j2));
            if (z) {
                this.mTransitions.h(generateTransitionKey(i2, i), Long.valueOf(j | REVERSED_BIT | j2));
            }
            return iAddChild;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r5v3 */
        public int getKeyframeIdAt(int i) {
            ?? r5;
            if (i < 0) {
                return 0;
            }
            kp<Integer> kpVar = this.mStateIds;
            int i2 = 0;
            int iA = ku.a(kpVar.b, kpVar.d, i);
            if (iA >= 0 && (r5 = kpVar.c[iA]) != kq.a) {
                i2 = r5;
            }
            return i2.intValue();
        }

        public int indexOfKeyframe(int[] iArr) {
            int iIndexOfStateSet = super.indexOfStateSet(iArr);
            return iIndexOfStateSet >= 0 ? iIndexOfStateSet : super.indexOfStateSet(StateSet.WILD_CARD);
        }

        public int indexOfTransition(int i, int i2) {
            return (int) ((Long) this.mTransitions.f(generateTransitionKey(i, i2), -1L)).longValue();
        }

        public boolean isTransitionReversed(int i, int i2) {
            return (((Long) this.mTransitions.f(generateTransitionKey(i, i2), -1L)).longValue() & REVERSED_BIT) != 0;
        }

        @Override // android.support.v7.graphics.drawable.StateListDrawableCompat.StateListState, android.support.v7.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        public void mutate() {
            this.mTransitions = this.mTransitions.clone();
            this.mStateIds = this.mStateIds.clone();
        }

        @Override // android.support.v7.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, null);
        }

        public boolean transitionHasReversibleFlag(int i, int i2) {
            return (((Long) this.mTransitions.f(generateTransitionKey(i, i2), -1L)).longValue() & REVERSIBLE_FLAG_BIT) != 0;
        }

        @Override // android.support.v7.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new AnimatedStateListDrawableCompat(this, resources);
        }
    }

    /* compiled from: PG */
    class AnimatedVectorDrawableTransition extends Transition {
        private final gky mAvd;

        public AnimatedVectorDrawableTransition(gky gkyVar) {
            super();
            this.mAvd = gkyVar;
        }

        @Override // android.support.v7.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void start() {
            this.mAvd.start();
        }

        @Override // android.support.v7.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void stop() {
            this.mAvd.stop();
        }
    }

    /* compiled from: PG */
    class AnimationDrawableTransition extends Transition {
        private final ObjectAnimator mAnim;
        private final boolean mHasReversibleFlag;

        public AnimationDrawableTransition(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            FrameInterpolator frameInterpolator = new FrameInterpolator(animationDrawable, z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(frameInterpolator.getTotalDuration());
            objectAnimatorOfInt.setInterpolator(frameInterpolator);
            this.mHasReversibleFlag = z2;
            this.mAnim = objectAnimatorOfInt;
        }

        @Override // android.support.v7.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public boolean canReverse() {
            return this.mHasReversibleFlag;
        }

        @Override // android.support.v7.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void reverse() {
            this.mAnim.reverse();
        }

        @Override // android.support.v7.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void start() {
            this.mAnim.start();
        }

        @Override // android.support.v7.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void stop() {
            this.mAnim.cancel();
        }
    }

    /* compiled from: PG */
    class FrameInterpolator implements TimeInterpolator {
        private int[] mFrameTimes;
        private int mFrames;
        private int mTotalDuration;

        public FrameInterpolator(AnimationDrawable animationDrawable, boolean z) {
            updateFrames(animationDrawable, z);
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = this.mFrames;
            int[] iArr = this.mFrameTimes;
            int i2 = (int) ((f * this.mTotalDuration) + 0.5f);
            int i3 = 0;
            while (i3 < i) {
                int i4 = iArr[i3];
                if (i2 < i4) {
                    break;
                }
                i2 -= i4;
                i3++;
            }
            return (i3 / i) + (i3 < i ? i2 / this.mTotalDuration : 0.0f);
        }

        public int getTotalDuration() {
            return this.mTotalDuration;
        }

        public int updateFrames(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.mFrames = numberOfFrames;
            int[] iArr = this.mFrameTimes;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.mFrameTimes = new int[numberOfFrames];
            }
            int[] iArr2 = this.mFrameTimes;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.mTotalDuration = i;
            return i;
        }
    }

    public AnimatedStateListDrawableCompat() {
        this(null, null);
    }

    public static AnimatedStateListDrawableCompat create(Context context, int i, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    return createFromXmlInner(context, resources, xml, attributeSetAsAttributeSet, theme);
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            Log.e(LOGTAG, "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e(LOGTAG, "parser error", e2);
            return null;
        }
    }

    public static AnimatedStateListDrawableCompat createFromXmlInner(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            AnimatedStateListDrawableCompat animatedStateListDrawableCompat = new AnimatedStateListDrawableCompat();
            animatedStateListDrawableCompat.inflate(context, resources, xmlPullParser, attributeSet, theme);
            return animatedStateListDrawableCompat;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void inflateChildElements(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals(ELEMENT_ITEM)) {
                    parseItem(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals(ELEMENT_TRANSITION)) {
                    parseTransition(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void init() {
        onStateChange(getState());
    }

    private int parseItem(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayL = crn.l(resources, theme, attributeSet, R.styleable.AnimatedStateListDrawableItem);
        int resourceId = typedArrayL.getResourceId(R.styleable.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = typedArrayL.getResourceId(1, -1);
        Drawable drawable = resourceId2 > 0 ? ResourceManagerInternal.get().getDrawable(context, resourceId2) : null;
        typedArrayL.recycle();
        int[] iArrExtractStateSet = extractStateSet(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(String.valueOf(xmlPullParser.getPositionDescription()).concat(ITEM_MISSING_DRAWABLE_ERROR));
            }
            drawable = xmlPullParser.getName().equals("vector") ? glh.c(resources, xmlPullParser, attributeSet, theme) : Compatibility.Api21Impl.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawable != null) {
            return this.mState.addStateSet(iArrExtractStateSet, drawable, resourceId);
        }
        throw new XmlPullParserException(String.valueOf(xmlPullParser.getPositionDescription()).concat(ITEM_MISSING_DRAWABLE_ERROR));
    }

    private int parseTransition(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayL = crn.l(resources, theme, attributeSet, R.styleable.AnimatedStateListDrawableTransition);
        int resourceId = typedArrayL.getResourceId(2, -1);
        int resourceId2 = typedArrayL.getResourceId(1, -1);
        int resourceId3 = typedArrayL.getResourceId(R.styleable.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable drawable = resourceId3 > 0 ? ResourceManagerInternal.get().getDrawable(context, resourceId3) : null;
        boolean z = typedArrayL.getBoolean(3, false);
        typedArrayL.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(String.valueOf(xmlPullParser.getPositionDescription()).concat(TRANSITION_MISSING_DRAWABLE_ERROR));
            }
            drawable = xmlPullParser.getName().equals("animated-vector") ? gky.b(context, resources, xmlPullParser, attributeSet, theme) : Compatibility.Api21Impl.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawable == null) {
            throw new XmlPullParserException(String.valueOf(xmlPullParser.getPositionDescription()).concat(TRANSITION_MISSING_DRAWABLE_ERROR));
        }
        if (resourceId == -1 || resourceId2 == -1) {
            throw new XmlPullParserException(String.valueOf(xmlPullParser.getPositionDescription()).concat(TRANSITION_MISSING_FROM_TO_ID));
        }
        return this.mState.addTransition(resourceId, resourceId2, drawable, z);
    }

    private boolean selectTransition(int i) {
        int currentIndex;
        int iIndexOfTransition;
        Transition animatableTransition;
        Transition transition = this.mTransition;
        if (transition == null) {
            currentIndex = getCurrentIndex();
        } else {
            if (i == this.mTransitionToIndex) {
                return true;
            }
            if (i == this.mTransitionFromIndex && transition.canReverse()) {
                transition.reverse();
                this.mTransitionToIndex = this.mTransitionFromIndex;
                this.mTransitionFromIndex = i;
                return true;
            }
            currentIndex = this.mTransitionToIndex;
            transition.stop();
        }
        this.mTransition = null;
        this.mTransitionFromIndex = -1;
        this.mTransitionToIndex = -1;
        AnimatedStateListState animatedStateListState = this.mState;
        int keyframeIdAt = animatedStateListState.getKeyframeIdAt(currentIndex);
        int keyframeIdAt2 = animatedStateListState.getKeyframeIdAt(i);
        if (keyframeIdAt2 == 0 || keyframeIdAt == 0 || (iIndexOfTransition = animatedStateListState.indexOfTransition(keyframeIdAt, keyframeIdAt2)) < 0) {
            return false;
        }
        boolean zTransitionHasReversibleFlag = animatedStateListState.transitionHasReversibleFlag(keyframeIdAt, keyframeIdAt2);
        selectDrawable(iIndexOfTransition);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            animatableTransition = new AnimationDrawableTransition((AnimationDrawable) current, animatedStateListState.isTransitionReversed(keyframeIdAt, keyframeIdAt2), zTransitionHasReversibleFlag);
        } else {
            if (!(current instanceof gky)) {
                if (current instanceof Animatable) {
                    animatableTransition = new AnimatableTransition((Animatable) current);
                }
                return false;
            }
            animatableTransition = new AnimatedVectorDrawableTransition((gky) current);
        }
        animatableTransition.start();
        this.mTransition = animatableTransition;
        this.mTransitionFromIndex = currentIndex;
        this.mTransitionToIndex = i;
        return true;
    }

    private void updateStateFromTypedArray(TypedArray typedArray) {
        AnimatedStateListState animatedStateListState = this.mState;
        animatedStateListState.mChangingConfigurations |= Compatibility.Api21Impl.getChangingConfigurations(typedArray);
        int[] iArr = R.styleable.AnimatedStateListDrawableCompat;
        animatedStateListState.setVariablePadding(typedArray.getBoolean(2, animatedStateListState.mVariablePadding));
        animatedStateListState.setConstantSize(typedArray.getBoolean(3, animatedStateListState.mConstantSize));
        animatedStateListState.setEnterFadeDuration(typedArray.getInt(4, animatedStateListState.mEnterFadeDuration));
        animatedStateListState.setExitFadeDuration(typedArray.getInt(5, animatedStateListState.mExitFadeDuration));
        setDither(typedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_dither, animatedStateListState.mDither));
    }

    public void addState(int[] iArr, Drawable drawable, int i) {
        drawable.getClass();
        this.mState.addStateSet(iArr, drawable, i);
        onStateChange(getState());
    }

    public <T extends Drawable & Animatable> void addTransition(int i, int i2, T t, boolean z) {
        t.getClass();
        this.mState.addTransition(i, i2, t, z);
    }

    @Override // android.support.v7.graphics.drawable.StateListDrawableCompat, android.support.v7.graphics.drawable.DrawableContainerCompat
    public void clearMutated() {
        super.clearMutated();
        this.mMutated = false;
    }

    @Override // android.support.v7.graphics.drawable.StateListDrawableCompat, android.support.v7.graphics.drawable.DrawableContainerCompat
    public AnimatedStateListState cloneConstantState() {
        return new AnimatedStateListState(this.mState, this, null);
    }

    @Override // android.support.v7.graphics.drawable.StateListDrawableCompat
    public void inflate(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayL = crn.l(resources, theme, attributeSet, R.styleable.AnimatedStateListDrawableCompat);
        setVisible(typedArrayL.getBoolean(1, true), true);
        updateStateFromTypedArray(typedArrayL);
        updateDensity(resources);
        typedArrayL.recycle();
        inflateChildElements(context, resources, xmlPullParser, attributeSet, theme);
        init();
    }

    @Override // android.support.v7.graphics.drawable.StateListDrawableCompat, android.support.v7.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.support.v7.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        Transition transition = this.mTransition;
        if (transition != null) {
            transition.stop();
            this.mTransition = null;
            selectDrawable(this.mTransitionToIndex);
            this.mTransitionToIndex = -1;
            this.mTransitionFromIndex = -1;
        }
    }

    @Override // android.support.v7.graphics.drawable.StateListDrawableCompat, android.support.v7.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.mMutated) {
            super.mutate();
            this.mState.mutate();
            this.mMutated = true;
        }
        return this;
    }

    @Override // android.support.v7.graphics.drawable.StateListDrawableCompat, android.support.v7.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int iIndexOfKeyframe = this.mState.indexOfKeyframe(iArr);
        boolean z = false;
        if (iIndexOfKeyframe != getCurrentIndex() && (selectTransition(iIndexOfKeyframe) || selectDrawable(iIndexOfKeyframe))) {
            z = true;
        }
        Drawable current = getCurrent();
        return current != null ? current.setState(iArr) | z : z;
    }

    @Override // android.support.v7.graphics.drawable.StateListDrawableCompat, android.support.v7.graphics.drawable.DrawableContainerCompat
    public void setConstantState(DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.setConstantState(drawableContainerState);
        if (drawableContainerState instanceof AnimatedStateListState) {
            this.mState = (AnimatedStateListState) drawableContainerState;
        }
    }

    @Override // android.support.v7.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Transition transition = this.mTransition;
        if (transition != null && (visible || z2)) {
            if (z) {
                transition.start();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }

    public AnimatedStateListDrawableCompat(AnimatedStateListState animatedStateListState, Resources resources) {
        super(null);
        this.mTransitionToIndex = -1;
        this.mTransitionFromIndex = -1;
        setConstantState(new AnimatedStateListState(animatedStateListState, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* compiled from: PG */
    abstract class Transition {
        private Transition() {
        }

        public boolean canReverse() {
            return false;
        }

        public abstract void start();

        public abstract void stop();

        public void reverse() {
        }
    }
}
