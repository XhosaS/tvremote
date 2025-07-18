package android.support.v7.view;

import android.view.View;
import android.view.animation.Interpolator;
import defpackage.cxe;
import defpackage.cxf;
import defpackage.cxg;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ViewPropertyAnimatorCompatSet {
    private Interpolator mInterpolator;
    private boolean mIsStarted;
    cxf mListener;
    private long mDuration = -1;
    private final cxg mProxyListener = new cxg() { // from class: android.support.v7.view.ViewPropertyAnimatorCompatSet.1
        private boolean mProxyStarted = false;
        private int mProxyEndCount = 0;

        @Override // defpackage.cxg, defpackage.cxf
        public void onAnimationEnd(View view) {
            int i = this.mProxyEndCount + 1;
            this.mProxyEndCount = i;
            if (i == ViewPropertyAnimatorCompatSet.this.mAnimators.size()) {
                cxf cxfVar = ViewPropertyAnimatorCompatSet.this.mListener;
                if (cxfVar != null) {
                    cxfVar.onAnimationEnd(null);
                }
                onEnd();
            }
        }

        @Override // defpackage.cxg, defpackage.cxf
        public void onAnimationStart(View view) {
            if (this.mProxyStarted) {
                return;
            }
            this.mProxyStarted = true;
            cxf cxfVar = ViewPropertyAnimatorCompatSet.this.mListener;
            if (cxfVar != null) {
                cxfVar.onAnimationStart(null);
            }
        }

        public void onEnd() {
            this.mProxyEndCount = 0;
            this.mProxyStarted = false;
            ViewPropertyAnimatorCompatSet.this.onAnimationsEnded();
        }
    };
    final ArrayList<cxe> mAnimators = new ArrayList<>();

    public void cancel() {
        if (this.mIsStarted) {
            ArrayList<cxe> arrayList = this.mAnimators;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).a();
            }
            this.mIsStarted = false;
        }
    }

    public void onAnimationsEnded() {
        this.mIsStarted = false;
    }

    public ViewPropertyAnimatorCompatSet play(cxe cxeVar) {
        if (!this.mIsStarted) {
            this.mAnimators.add(cxeVar);
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet playSequentially(cxe cxeVar, cxe cxeVar2) {
        this.mAnimators.add(cxeVar);
        View view = (View) ((WeakReference) cxeVar.a).get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) ((WeakReference) cxeVar2.a).get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        this.mAnimators.add(cxeVar2);
        return this;
    }

    public ViewPropertyAnimatorCompatSet setDuration(long j) {
        if (!this.mIsStarted) {
            this.mDuration = j;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setInterpolator(Interpolator interpolator) {
        if (!this.mIsStarted) {
            this.mInterpolator = interpolator;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setListener(cxf cxfVar) {
        if (!this.mIsStarted) {
            this.mListener = cxfVar;
        }
        return this;
    }

    public void start() {
        View view;
        if (this.mIsStarted) {
            return;
        }
        ArrayList<cxe> arrayList = this.mAnimators;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cxe cxeVar = arrayList.get(i);
            long j = this.mDuration;
            if (j >= 0) {
                cxeVar.d(j);
            }
            Interpolator interpolator = this.mInterpolator;
            if (interpolator != null && (view = (View) ((WeakReference) cxeVar.a).get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.mListener != null) {
                cxeVar.e(this.mProxyListener);
            }
            cxeVar.b();
        }
        this.mIsStarted = true;
    }
}
