package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sej extends SimpleItemAnimator {
    public final ValueAnimator a;
    public final sel i;
    private final TimeInterpolator j;
    private final ArrayList k = new ArrayList();
    private final ArrayList l = new ArrayList();
    private final ArrayList m = new ArrayList();
    private final ArrayList n = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public sej(sel selVar) {
        this.i = selVar;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.a = valueAnimatorOfFloat;
        this.j = valueAnimatorOfFloat.getInterpolator();
        valueAnimatorOfFloat.setDuration(getMoveDuration());
        valueAnimatorOfFloat.addUpdateListener(new fsz(this, 7));
    }

    private final void b(List list, RecyclerView.ViewHolder viewHolder) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            seh sehVar = (seh) list.get(size);
            if (e(sehVar, viewHolder) && sehVar.a == null && sehVar.b == null) {
                list.remove(sehVar);
            }
        }
    }

    private final void c(seh sehVar) {
        RecyclerView.ViewHolder viewHolder = sehVar.a;
        if (viewHolder != null) {
            e(sehVar, viewHolder);
        }
        RecyclerView.ViewHolder viewHolder2 = sehVar.b;
        if (viewHolder2 != null) {
            e(sehVar, viewHolder2);
        }
    }

    private final void d(RecyclerView.ViewHolder viewHolder) {
        viewHolder.itemView.animate().setInterpolator(this.j);
        endAnimation(viewHolder);
    }

    private final boolean e(seh sehVar, RecyclerView.ViewHolder viewHolder) {
        boolean z = false;
        if (sehVar.b == viewHolder) {
            sehVar.b = null;
        } else {
            if (sehVar.a != viewHolder) {
                return false;
            }
            sehVar.a = null;
            z = true;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(viewHolder, z);
        return true;
    }

    private static final void f(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((RecyclerView.ViewHolder) list.get(size)).itemView.animate().cancel();
            }
        }
    }

    public final void a() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    @Override // android.support.v7.widget.SimpleItemAnimator
    public final boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        d(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.l.add(viewHolder);
        return true;
    }

    @Override // android.support.v7.widget.SimpleItemAnimator
    public final boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (viewHolder == viewHolder2) {
            animateMove(viewHolder, i, i2, i3, i4);
            return true;
        }
        Log.e("TagItemAnimator", String.format("Unexpected change animation: %d->%d", Integer.valueOf(viewHolder.getAdapterPosition()), Integer.valueOf(viewHolder2 != null ? viewHolder2.getAdapterPosition() : -1)));
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        d(viewHolder);
        float f = (i3 - i) - translationX;
        float f2 = (i4 - i2) - translationY;
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            d(viewHolder2);
            viewHolder2.itemView.setTranslationX(-((int) f));
            viewHolder2.itemView.setTranslationY(-((int) f2));
            viewHolder2.itemView.setAlpha(0.0f);
        }
        this.n.add(new seh(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }

    @Override // android.support.v7.widget.SimpleItemAnimator
    public final boolean animateMove(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int translationX = (int) view.getTranslationX();
        int translationY = (int) viewHolder.itemView.getTranslationY();
        d(viewHolder);
        int i5 = i + translationX;
        if (i3 - i5 != 0) {
            view.setTranslationX(-r11);
        }
        int i6 = i2 + translationY;
        if (i4 - i6 != 0) {
            view.setTranslationY(-r11);
        }
        this.m.add(new sei(viewHolder, i5, i6, i3, i4));
        return true;
    }

    @Override // android.support.v7.widget.SimpleItemAnimator
    public final boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        d(viewHolder);
        this.k.add(viewHolder);
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public final boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder, List<Object> list) {
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public final void endAnimation(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((sei) arrayList.get(size)).e == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(viewHolder);
                arrayList.remove(size);
            }
        }
        b(this.n, viewHolder);
        if (this.k.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.l.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
        }
        ArrayList arrayList2 = this.d;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            b(arrayList3, viewHolder);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.c;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((sei) arrayList5.get(size4)).e == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(viewHolder);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList6 = this.b;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.g.remove(viewHolder);
                this.e.remove(viewHolder);
                this.h.remove(viewHolder);
                this.f.remove(viewHolder);
                a();
                return;
            }
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(viewHolder)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(viewHolder);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public final void endAnimations() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ((sei) arrayList.get(size)).e;
            View view = viewHolder.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(viewHolder);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.k;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            dispatchRemoveFinished((RecyclerView.ViewHolder) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.l;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) arrayList3.get(size3);
            viewHolder2.itemView.setAlpha(1.0f);
            dispatchAddFinished(viewHolder2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.n;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            } else {
                c((seh) arrayList4.get(size4));
            }
        }
        arrayList4.clear();
        if (!isRunning()) {
            return;
        }
        ArrayList arrayList5 = this.c;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    RecyclerView.ViewHolder viewHolder3 = (RecyclerView.ViewHolder) ((sei) arrayList6.get(size6)).e;
                    View view2 = viewHolder3.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(viewHolder3);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList arrayList7 = this.b;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.ViewHolder viewHolder4 = (RecyclerView.ViewHolder) arrayList8.get(size8);
                    viewHolder4.itemView.setAlpha(1.0f);
                    dispatchAddFinished(viewHolder4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList arrayList9 = this.d;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                f(this.g);
                f(this.f);
                f(this.e);
                f(this.h);
                this.a.cancel();
                dispatchAnimationsFinished();
                return;
            }
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    c((seh) arrayList10.get(size10));
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public final boolean isRunning() {
        return (this.l.isEmpty() && this.n.isEmpty() && this.m.isEmpty() && this.k.isEmpty() && this.f.isEmpty() && this.g.isEmpty() && this.e.isEmpty() && this.h.isEmpty() && this.c.isEmpty() && this.b.isEmpty() && this.d.isEmpty()) ? false : true;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public final RecyclerView.ItemAnimator.ItemHolderInfo recordPostLayoutInformation(RecyclerView.State state, RecyclerView.ViewHolder viewHolder) {
        state.put(R.id.play__fireball__state_animation_layout, 1);
        if (!this.a.isRunning()) {
            this.i.a(0.0f);
        }
        return super.recordPostLayoutInformation(state, viewHolder);
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public final void runPendingAnimations() {
        ArrayList arrayList = this.k;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.m;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.n;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        boolean z = !zIsEmpty3;
        ArrayList arrayList4 = this.l;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4) {
            if (zIsEmpty3) {
                return;
            } else {
                z = true;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) arrayList.get(i);
            View view = viewHolder.itemView;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.g.add(viewHolder);
            viewPropertyAnimatorAnimate.setDuration(getRemoveDuration()).alpha(0.0f).translationX(0.0f).translationY(0.0f).setListener(new sec(this, viewHolder, viewPropertyAnimatorAnimate, view)).start();
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.c.add(arrayList5);
            arrayList2.clear();
            rmz rmzVar = new rmz(this, arrayList5, 11);
            if (zIsEmpty) {
                rmzVar.run();
            } else {
                View view2 = ((RecyclerView.ViewHolder) ((sei) arrayList5.get(0)).e).itemView;
                long removeDuration = getRemoveDuration();
                int[] iArr = cww.a;
                view2.postOnAnimationDelayed(rmzVar, removeDuration);
            }
        }
        if (z) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.d.add(arrayList6);
            arrayList3.clear();
            rmz rmzVar2 = new rmz(this, arrayList6, 12);
            if (zIsEmpty) {
                rmzVar2.run();
            } else {
                RecyclerView.ViewHolder viewHolder2 = ((seh) arrayList6.get(0)).a;
                if (viewHolder2 != null) {
                    long removeDuration2 = getRemoveDuration();
                    int[] iArr2 = cww.a;
                    viewHolder2.itemView.postOnAnimationDelayed(rmzVar2, removeDuration2);
                }
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.b.add(arrayList7);
        arrayList4.clear();
        rmz rmzVar3 = new rmz(this, arrayList7, 13);
        if (zIsEmpty && zIsEmpty2 && !z) {
            rmzVar3.run();
            return;
        }
        long removeDuration3 = (!zIsEmpty ? getRemoveDuration() : 0L) + Math.max(!zIsEmpty2 ? getMoveDuration() : 0L, z ? getChangeDuration() : 0L);
        View view3 = ((RecyclerView.ViewHolder) arrayList7.get(0)).itemView;
        int[] iArr3 = cww.a;
        view3.postOnAnimationDelayed(rmzVar3, removeDuration3);
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public final void setMoveDuration(long j) {
        super.setMoveDuration(j);
        this.a.setDuration(j);
    }
}
