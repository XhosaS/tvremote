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
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kko extends SimpleItemAnimator {
    public final ValueAnimator a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    private final TimeInterpolator i;
    private final ArrayList j;
    private final ArrayList k;
    private final ArrayList l;
    private final ArrayList m;

    public kko(kkp kkpVar) {
        kkpVar.getClass();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.getClass();
        this.a = valueAnimatorOfFloat;
        TimeInterpolator interpolator = valueAnimatorOfFloat.getInterpolator();
        interpolator.getClass();
        this.i = interpolator;
        valueAnimatorOfFloat.setDuration(getMoveDuration());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kkh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getClass();
                valueAnimator.getAnimatedFraction();
            }
        });
    }

    private final void b(List list, RecyclerView.ViewHolder viewHolder) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            kki kkiVar = (kki) list.get(size);
            if (e(kkiVar, viewHolder) && kkiVar.a == null && kkiVar.b == null) {
                list.remove(kkiVar);
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    private final void c(kki kkiVar) {
        RecyclerView.ViewHolder viewHolder = kkiVar.a;
        if (viewHolder != null) {
            e(kkiVar, viewHolder);
        }
        RecyclerView.ViewHolder viewHolder2 = kkiVar.b;
        if (viewHolder2 != null) {
            e(kkiVar, viewHolder2);
        }
    }

    private final void d(RecyclerView.ViewHolder viewHolder) {
        viewHolder.itemView.animate().setInterpolator(this.i);
        endAnimation(viewHolder);
    }

    private final boolean e(kki kkiVar, RecyclerView.ViewHolder viewHolder) {
        boolean z = false;
        if (kkiVar.b == viewHolder) {
            kkiVar.b = null;
        } else {
            if (kkiVar.a != viewHolder) {
                return false;
            }
            kkiVar.a = null;
            z = true;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(viewHolder, z);
        return true;
    }

    private static final void f(List list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            Object obj = list.get(size);
            obj.getClass();
            ((RecyclerView.ViewHolder) obj).itemView.animate().cancel();
            if (i < 0) {
                return;
            } else {
                size = i;
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
        viewHolder.getClass();
        d(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.k.add(viewHolder);
        return true;
    }

    @Override // android.support.v7.widget.SimpleItemAnimator
    public final boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        viewHolder.getClass();
        if (viewHolder == viewHolder2) {
            animateMove(viewHolder, i, i2, i3, i4);
            return true;
        }
        String str = String.format("Unexpected change animation: %d->%d", Arrays.copyOf(new Object[]{Integer.valueOf(viewHolder.getAdapterPosition()), Integer.valueOf(viewHolder2 != null ? viewHolder2.getAdapterPosition() : -1)}, 2));
        str.getClass();
        Log.e("TagItemAnimator", str);
        View view = viewHolder.itemView;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
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
        this.m.add(new kki(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }

    @Override // android.support.v7.widget.SimpleItemAnimator
    public final boolean animateMove(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        viewHolder.getClass();
        View view = viewHolder.itemView;
        view.getClass();
        int translationX = (int) view.getTranslationX();
        int translationY = (int) viewHolder.itemView.getTranslationY();
        d(viewHolder);
        int i5 = i + translationX;
        int i6 = i3 - i5;
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        int i7 = i2 + translationY;
        int i8 = i4 - i7;
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        this.l.add(new sei(viewHolder, i5, i7, i3, i4, null));
        return true;
    }

    @Override // android.support.v7.widget.SimpleItemAnimator
    public final boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        viewHolder.getClass();
        d(viewHolder);
        this.j.add(viewHolder);
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public final boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder, List<? extends Object> list) {
        viewHolder.getClass();
        list.getClass();
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public final void endAnimation(RecyclerView.ViewHolder viewHolder) {
        viewHolder.getClass();
        View view = viewHolder.itemView;
        view.getClass();
        view.animate().cancel();
        ArrayList arrayList = this.l;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                Object obj = arrayList.get(size);
                obj.getClass();
                if (((sei) obj).e == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(viewHolder);
                    arrayList.remove(size);
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        b(this.m, viewHolder);
        if (this.j.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.k.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
        }
        ArrayList arrayList2 = this.d;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                Object obj2 = arrayList2.get(size2);
                obj2.getClass();
                ArrayList arrayList3 = (ArrayList) obj2;
                b(arrayList3, viewHolder);
                if (arrayList3.isEmpty()) {
                    arrayList2.remove(size2);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        ArrayList arrayList4 = this.c;
        int size3 = arrayList4.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                Object obj3 = arrayList4.get(size3);
                obj3.getClass();
                ArrayList arrayList5 = (ArrayList) obj3;
                int size4 = arrayList5.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i4 = size4 - 1;
                        Object obj4 = arrayList5.get(size4);
                        obj4.getClass();
                        if (((sei) obj4).e != viewHolder) {
                            if (i4 < 0) {
                                break;
                            } else {
                                size4 = i4;
                            }
                        } else {
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
                if (i3 < 0) {
                    break;
                } else {
                    size3 = i3;
                }
            }
        }
        ArrayList arrayList6 = this.b;
        int size5 = arrayList6.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i5 = size5 - 1;
                Object obj5 = arrayList6.get(size5);
                obj5.getClass();
                ArrayList arrayList7 = (ArrayList) obj5;
                if (arrayList7.remove(viewHolder)) {
                    view.setAlpha(1.0f);
                    dispatchAddFinished(viewHolder);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
                if (i5 < 0) {
                    break;
                } else {
                    size5 = i5;
                }
            }
        }
        this.g.remove(viewHolder);
        this.e.remove(viewHolder);
        this.h.remove(viewHolder);
        this.f.remove(viewHolder);
        a();
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public final void endAnimations() {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Object obj = arrayList.get(size);
            obj.getClass();
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ((sei) obj).e;
            View view = viewHolder.itemView;
            view.getClass();
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(viewHolder);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.j;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            Object obj2 = arrayList2.get(size2);
            obj2.getClass();
            dispatchRemoveFinished((RecyclerView.ViewHolder) obj2);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.k;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            Object obj3 = arrayList3.get(size3);
            obj3.getClass();
            RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) obj3;
            viewHolder2.itemView.setAlpha(1.0f);
            dispatchAddFinished(viewHolder2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.m;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            Object obj4 = arrayList4.get(size4);
            obj4.getClass();
            c((kki) obj4);
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
            Object obj5 = arrayList5.get(size5);
            obj5.getClass();
            ArrayList arrayList6 = (ArrayList) obj5;
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    Object obj6 = arrayList6.get(size6);
                    obj6.getClass();
                    RecyclerView.ViewHolder viewHolder3 = (RecyclerView.ViewHolder) ((sei) obj6).e;
                    View view2 = viewHolder3.itemView;
                    view2.getClass();
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
            Object obj7 = arrayList7.get(size7);
            obj7.getClass();
            ArrayList arrayList8 = (ArrayList) obj7;
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    Object obj8 = arrayList8.get(size8);
                    obj8.getClass();
                    RecyclerView.ViewHolder viewHolder4 = (RecyclerView.ViewHolder) obj8;
                    View view3 = viewHolder4.itemView;
                    view3.getClass();
                    view3.setAlpha(1.0f);
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
            Object obj9 = arrayList9.get(size9);
            obj9.getClass();
            ArrayList arrayList10 = (ArrayList) obj9;
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    Object obj10 = arrayList10.get(size10);
                    obj10.getClass();
                    c((kki) obj10);
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public final boolean isRunning() {
        return (this.k.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.j.isEmpty() && this.f.isEmpty() && this.g.isEmpty() && this.e.isEmpty() && this.h.isEmpty() && this.c.isEmpty() && this.b.isEmpty() && this.d.isEmpty()) ? false : true;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public final RecyclerView.ItemAnimator.ItemHolderInfo recordPostLayoutInformation(RecyclerView.State state, RecyclerView.ViewHolder viewHolder) {
        state.getClass();
        viewHolder.getClass();
        state.put(R.id.gtv__fireball__state_animation_layout, 1);
        this.a.isRunning();
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfoRecordPostLayoutInformation = super.recordPostLayoutInformation(state, viewHolder);
        itemHolderInfoRecordPostLayoutInformation.getClass();
        return itemHolderInfoRecordPostLayoutInformation;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public final void runPendingAnimations() {
        ArrayList arrayList = this.j;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.l;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.m;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        boolean z = !zIsEmpty3;
        ArrayList arrayList4 = this.k;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4) {
            if (zIsEmpty3) {
                return;
            } else {
                z = true;
            }
        }
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) next;
            View view = viewHolder.itemView;
            view.getClass();
            ArrayList arrayList5 = this.g;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            arrayList5.add(viewHolder);
            viewPropertyAnimatorAnimate.setDuration(getRemoveDuration()).alpha(0.0f).translationX(0.0f).translationY(0.0f).setListener(new kkn(this, viewHolder, viewPropertyAnimatorAnimate, view)).start();
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList2);
            this.c.add(arrayList6);
            arrayList2.clear();
            gvj gvjVar = new gvj(this, arrayList6, 14);
            if (zIsEmpty) {
                gvjVar.run();
            } else {
                View view2 = ((RecyclerView.ViewHolder) ((sei) arrayList6.get(0)).e).itemView;
                view2.getClass();
                long removeDuration = getRemoveDuration();
                int[] iArr = cww.a;
                view2.postOnAnimationDelayed(gvjVar, removeDuration);
            }
        }
        byte[] bArr = null;
        if (z) {
            ArrayList arrayList7 = new ArrayList();
            arrayList7.addAll(arrayList3);
            this.d.add(arrayList7);
            arrayList3.clear();
            gvj gvjVar2 = new gvj(arrayList7, this, 15, bArr);
            if (zIsEmpty) {
                gvjVar2.run();
            } else {
                RecyclerView.ViewHolder viewHolder2 = ((kki) arrayList7.get(0)).a;
                if (viewHolder2 != null) {
                    long removeDuration2 = getRemoveDuration();
                    int[] iArr2 = cww.a;
                    viewHolder2.itemView.postOnAnimationDelayed(gvjVar2, removeDuration2);
                }
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList8 = new ArrayList();
        arrayList8.addAll(arrayList4);
        this.b.add(arrayList8);
        arrayList4.clear();
        gvj gvjVar3 = new gvj(arrayList8, this, 16, bArr);
        if (zIsEmpty && zIsEmpty2 && !z) {
            gvjVar3.run();
            return;
        }
        long removeDuration3 = (!zIsEmpty ? getRemoveDuration() : 0L) + Math.max(!zIsEmpty2 ? getMoveDuration() : 0L, z ? getChangeDuration() : 0L);
        View view3 = ((RecyclerView.ViewHolder) arrayList8.get(0)).itemView;
        view3.getClass();
        int[] iArr3 = cww.a;
        view3.postOnAnimationDelayed(gvjVar3, removeDuration3);
    }

    @Override // android.support.v7.widget.RecyclerView.ItemAnimator
    public final void setMoveDuration(long j) {
        super.setMoveDuration(j);
        this.a.setDuration(j);
    }
}
