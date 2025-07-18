package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thn extends Animator implements Animator.AnimatorListener {
    ArrayList a = null;
    private final Animator b;

    public thn(Animator animator) {
        this.b = animator;
        animator.addListener(this);
    }

    @Override // android.animation.Animator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final thn clone() {
        thn thnVar = (thn) super.clone();
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            thnVar.a = new ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                thnVar.a.add((Animator.AnimatorListener) arrayList.get(i));
            }
        }
        return thnVar;
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void cancel() {
        this.b.cancel();
    }

    @Override // android.animation.Animator
    public final void end() {
        this.b.end();
    }

    @Override // android.animation.Animator
    public final long getDuration() {
        return this.b.getDuration();
    }

    @Override // android.animation.Animator
    public final TimeInterpolator getInterpolator() {
        return this.b.getInterpolator();
    }

    @Override // android.animation.Animator
    public final ArrayList getListeners() {
        return this.a;
    }

    @Override // android.animation.Animator
    public final long getStartDelay() {
        return this.b.getStartDelay();
    }

    @Override // android.animation.Animator
    public final boolean isPaused() {
        return this.b.isPaused();
    }

    @Override // android.animation.Animator
    public final boolean isRunning() {
        return this.b.isRunning();
    }

    @Override // android.animation.Animator
    public final boolean isStarted() {
        return this.b.isStarted();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((Animator.AnimatorListener) arrayList2.get(i)).onAnimationCancel(this);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((Animator.AnimatorListener) arrayList2.get(i)).onAnimationEnd(this);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((Animator.AnimatorListener) arrayList2.get(i)).onAnimationRepeat(this);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((Animator.AnimatorListener) arrayList2.get(i)).onAnimationStart(this);
            }
        }
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            arrayList.clear();
            this.a = null;
        }
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
        if (this.a.size() == 0) {
            this.a = null;
        }
    }

    @Override // android.animation.Animator
    public final Animator setDuration(long j) {
        this.b.setDuration(j);
        return this;
    }

    @Override // android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        this.b.setInterpolator(timeInterpolator);
    }

    @Override // android.animation.Animator
    public final void setStartDelay(long j) {
        this.b.setStartDelay(j);
    }

    @Override // android.animation.Animator
    public final void setTarget(Object obj) {
        this.b.setTarget(obj);
    }

    @Override // android.animation.Animator
    public final void setupEndValues() {
        this.b.setupEndValues();
    }

    @Override // android.animation.Animator
    public final void setupStartValues() {
        this.b.setupStartValues();
    }

    @Override // android.animation.Animator
    public final void start() {
        this.b.start();
    }

    @Override // android.animation.Animator
    public final void pause() {
    }

    @Override // android.animation.Animator
    public final void resume() {
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
    }
}
