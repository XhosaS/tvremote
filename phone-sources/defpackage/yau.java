package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.onegoogle.common.CirclePulseDrawable;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableSet;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentMap;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yau {
    public final Object a;
    public boolean b;
    public Object c;

    public yau() {
        this.b = false;
        this.c = null;
        this.a = null;
    }

    public static AnimatorSet c(CirclePulseDrawable circlePulseDrawable, String str, int i, long j, long j2) {
        ObjectAnimator duration = ObjectAnimator.ofInt(circlePulseDrawable, str, 0, i).setDuration(j);
        duration.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator duration2 = ObjectAnimator.ofInt(circlePulseDrawable, str, i, 0).setDuration(j2);
        duration2.setInterpolator(new AccelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2);
        return animatorSet;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    public final Future a() {
        this.b = true;
        return this.c;
    }

    final void b(Future future) {
        boolean z;
        synchronized (this.a) {
            z = this.b;
            if (!z) {
                this.c = future;
            }
        }
        if (z) {
            future.cancel(false);
        }
    }

    public final ryq d() {
        return new ryt(new ryq() { // from class: ryr
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, tsl] */
            @Override // defpackage.ryq
            public final ryp a(final rwv rwvVar) {
                ryp[] rypVarArr;
                ryp rypVar;
                ryp[] rypVarArr2;
                int length;
                yau yauVar = this.a;
                ?? r1 = yauVar.a;
                unx unxVar = ryp.h;
                Context context = rwvVar.c;
                final String str = (String) r1.apply(context);
                final boolean z = yauVar.b;
                final ?? r0 = yauVar.c;
                ttm ttmVarL = sij.l(new ttm() { // from class: ryo
                    @Override // defpackage.ttm
                    public final Object get() {
                        return new ryp(rwvVar, str, z, r0);
                    }
                });
                AtomicReference atomicReference = (AtomicReference) ConcurrentMap.EL.computeIfAbsent(unxVar.b, str, new nrc(13));
                do {
                    rypVarArr = (ryp[]) atomicReference.get();
                    if (rypVarArr == null || (length = rypVarArr.length) == 0) {
                        ryp rypVar2 = (ryp) ttmVarL.get();
                        rypVar = rypVar2;
                        rypVarArr2 = new ryp[]{rypVar2};
                    } else {
                        ryp rypVar3 = rypVarArr[0];
                        if (rypVar3.c.equals("")) {
                            rypVar = rypVar3;
                            rypVarArr2 = null;
                        } else {
                            rypVar = (ryp) ttmVarL.get();
                            rypVarArr2 = new ryp[length + 1];
                            rypVarArr2[0] = rypVar;
                            System.arraycopy(rypVarArr, 0, rypVarArr2, 1, length);
                        }
                    }
                    if (rypVarArr2 == null) {
                        break;
                    }
                } while (!a.t(atomicReference, rypVarArr, rypVarArr2));
                if (rypVarArr2 != null) {
                    zft zftVar = new zft(unxVar);
                    zft zftVar2 = new zft(unxVar);
                    if (rzc.b == null) {
                        synchronized (rzc.class) {
                            if (rzc.b == null) {
                                if (!Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        context.registerReceiver(new rzc(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                    } else {
                                        context.registerReceiver(new rzc(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                    }
                                }
                                rzc.b = zftVar;
                                rzc.a = zftVar2;
                            }
                        }
                    }
                }
                boolean z2 = rypVar.d;
                sij.s(true, "Package %s cannot be registered both with and without stickyAccountSupport", str);
                return rypVar;
            }
        });
    }

    public final void e(Set set) {
        this.c = ImmutableSet.copyOf((Collection) set);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Queue] */
    public final void f(ooa ooaVar) {
        synchronized (this.a) {
            if (this.c == null) {
                this.c = new ArrayDeque();
            }
            this.c.add(ooaVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final void g(onz onzVar) {
        ooa ooaVar;
        synchronized (this.a) {
            if (this.c != null && !this.b) {
                this.b = true;
                while (true) {
                    synchronized (this.a) {
                        ooaVar = (ooa) this.c.poll();
                        if (ooaVar == null) {
                            this.b = false;
                            return;
                        }
                    }
                    ooaVar.b(onzVar);
                }
            }
        }
    }

    public yau(Object obj) {
        this.a = obj;
    }

    public yau(byte[] bArr) {
        this.a = new Object();
    }

    public yau(Context context) {
        int iAt = rrx.at(context, R.attr.ogCriticalAlertRingColor);
        this.a = new CirclePulseDrawable(new ColorDrawable(0), iAt, iAt);
    }

    public yau(tsl tslVar) {
        this.c = ImmutableSet.of();
        this.b = false;
        this.a = tslVar;
    }
}
