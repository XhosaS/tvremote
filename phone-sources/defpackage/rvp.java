package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.os.Bundle;
import android.os.Trace;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
import com.google.android.videos.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rvp implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ rvp(aaai aaaiVar, String str, aaat aaatVar, int i) {
        this.d = i;
        this.b = aaaiVar;
        this.a = str;
        this.c = aaatVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 6;
        Object obj = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        switch (this.d) {
            case 0:
                rvq.b(new rmz(this.a, this.b, i), this.c);
                return;
            case 1:
                View view = (View) this.b;
                View viewFindViewById = view.findViewById(R.id.og_header_close_button);
                Object obj2 = this.c;
                viewFindViewById.setOnClickListener(new phn(obj2, 11));
                rme rmeVar = (rme) obj2;
                rmeVar.c = new rlp(rmeVar.g, rlp.a, view.findViewById(R.id.og_container_scroll_view));
                rmeVar.c.b();
                if (this.a == null) {
                    ExpandableDialogView expandableDialogView = rmeVar.g;
                    expandableDialogView.getClass();
                    expandableDialogView.setAlpha(0.0f);
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(expandableDialogView, (Property<ExpandableDialogView, Float>) rme.a, 0.0f, 1.0f);
                    objectAnimatorOfFloat.setDuration(83L);
                    objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(expandableDialogView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.8f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.8f, 1.0f));
                    objectAnimatorOfPropertyValuesHolder.setDuration(200L);
                    objectAnimatorOfPropertyValuesHolder.setInterpolator(new duq());
                    expandableDialogView.getViewTreeObserver().addOnPreDrawListener(new phv(expandableDialogView, 2));
                    bl blVar = (bl) obj2;
                    if (blVar.getDialog() != null && blVar.getDialog().getWindow() != null) {
                        int color = ((bv) obj2).requireContext().getColor(R.color.google_scrim);
                        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(blVar.getDialog().getWindow().getDecorView(), (Property<View, V>) rme.b, new snt(), Integer.valueOf(csq.g(color, 0)), Integer.valueOf(color));
                        objectAnimatorOfObject.setInterpolator(new LinearInterpolator());
                        objectAnimatorOfObject.setDuration(200L);
                        objectAnimatorOfObject.start();
                    }
                    objectAnimatorOfFloat.start();
                    objectAnimatorOfPropertyValuesHolder.start();
                    return;
                }
                return;
            case 2:
                ((ulh) this.a).a.execute(new ukm(this.c, this.b, 7, b == true ? 1 : 0));
                return;
            case 3:
                ((ulh) this.a).a.execute(new ukm(this.c, this.b, 5, b2 == true ? 1 : 0));
                return;
            case 4:
                ((ulh) this.a).a.execute(new ukm(this.c, this.b, i, b3 == true ? 1 : 0));
                return;
            case 5:
                Object obj3 = this.b;
                try {
                    ((uoj) this.c).h((Intent) this.a);
                    return;
                } finally {
                    ((kwy) obj3).u(null);
                }
            case 6:
                Iterator it = this.c.iterator();
                while (true) {
                    Object obj4 = this.a;
                    if (!it.hasNext()) {
                        ((usj) obj4).c();
                        return;
                    } else {
                        ((usj) obj4).b.c((usp) it.next(), (String) this.b);
                    }
                }
            case 7:
                Object obj5 = this.c;
                Object obj6 = this.b;
                usj usjVar = (usj) this.a;
                usjVar.b.c((usp) obj6, (String) obj5);
                usjVar.c();
                return;
            case 8:
                ((usy) this.a).b().c((String) this.b, (Throwable) this.c);
                return;
            case 9:
                ((usy) this.a).b().a((wbb) this.b, (xsm) this.c);
                return;
            case 10:
                ((utf) this.a).b.c((String) this.b, (Throwable) this.c);
                return;
            case 11:
                ((utf) this.a).b.a((wbb) this.b, (xsm) this.c);
                return;
            case 12:
                ((utr) this.c).i((upq) this.a, (uto) this.b);
                return;
            case 13:
                utr utrVar = (utr) this.a;
                Iterator it2 = utrVar.b.iterator();
                while (it2.hasNext()) {
                    ((uhp) it2.next()).cancel(true);
                }
                xqb xqbVar = utrVar.i;
                if (xqbVar != null) {
                    xqbVar.c((String) this.b, (Throwable) this.c);
                    return;
                }
                return;
            case 14:
                ((utr) this.c).i((upq) this.a, (uto) this.b);
                return;
            case 15:
                Object obj7 = this.a;
                utn utnVar = (utn) obj7;
                boolean z = utnVar.a;
                Object obj8 = this.b;
                Object obj9 = this.c;
                if (z) {
                    return;
                }
                try {
                    ((utn) obj7).c.a((xtk) obj9, (xsm) obj8);
                    return;
                } finally {
                    utnVar.a = true;
                    utnVar.b.g.a();
                }
            case 16:
                ((utw) this.a).a.a((xtk) this.c, (xsm) this.b);
                return;
            case 17:
                ((xwe) this.c).b.a((wbb) this.a, (xsm) this.b);
                return;
            case 18:
                ((xwd) this.c).c.a((xtk) this.b, (xsm) this.a);
                return;
            case 19:
                Object obj10 = this.a;
                synchronized (((yau) obj10).a) {
                    if (((yau) obj10).b) {
                        return;
                    }
                    ((yau) obj10).a();
                    ((yay) this.b).b.g.execute(new xxl((Object) this, this.c, 8, (byte[]) null));
                    return;
                }
            default:
                new zyg("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor " + ((String) this.a) + " running callback", 0);
                try {
                    new xxl((Object) ((aaai) this.b).k, this.c, 17, (char[]) (b4 == true ? 1 : 0)).run();
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
        }
    }

    public /* synthetic */ rvp(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ rvp(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ rvp(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ rvp(rme rmeVar, View view, Bundle bundle, int i) {
        this.d = i;
        this.c = rmeVar;
        this.b = view;
        this.a = bundle;
    }

    public rvp(xwd xwdVar, xtk xtkVar, xsm xsmVar, int i) {
        this.d = i;
        this.b = xtkVar;
        this.a = xsmVar;
        this.c = xwdVar;
    }

    public rvp(xwe xweVar, wbb wbbVar, xsm xsmVar, int i) {
        this.d = i;
        this.a = wbbVar;
        this.b = xsmVar;
        this.c = xweVar;
    }

    public rvp(yay yayVar, yau yauVar, yaz yazVar, int i) {
        this.d = i;
        this.a = yauVar;
        this.c = yazVar;
        this.b = yayVar;
    }
}
