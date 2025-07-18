package defpackage;

import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tku implements odj {
    private static final zdy a = zdy.h("com/google/android/libraries/search/rendering/xuikit/elements/logging/image/XUiKitImagePerfLogger");
    private final Set b;
    private final yrx c;
    private final ConcurrentHashMap d = new ConcurrentHashMap();

    public tku(Set set, yrx yrxVar) {
        this.b = set;
        this.c = yrxVar;
    }

    @Override // defpackage.odj
    public final void a(int i, njs njsVar, njw njwVar, ddj ddjVar) {
        njsVar.getClass();
        yrn yrnVar = (yrn) this.d.remove(Integer.valueOf(i));
        if (yrnVar != null) {
            yrnVar.f();
        } else {
            yrnVar = null;
        }
        if (yrnVar == null) {
            ((zdv) ((zdv) a.c()).p(ddjVar).q("com/google/android/libraries/search/rendering/xuikit/elements/logging/image/XUiKitImagePerfLogger", "onImageError", 95, "XUiKitImagePerfLogger.kt")).u("xUIKit image load failed received without a corresponding start signal.");
            return;
        }
        for (tmn tmnVar : this.b) {
            Duration durationOfNanos = Duration.ofNanos(yrnVar.b());
            durationOfNanos.getClass();
            acjn acjnVar = acjn.a;
            acjm acjmVar = new acjm();
            tmnVar.b(njwVar != null ? njwVar.k() : null);
            acjo.b(acjmVar);
            tmnVar.a("Elements.ImageLoading.Availability.Failure.OtherCount", "Elements.ImageLoading.Latency.Failure.Other.DurationInMs", acjo.a(acjmVar), durationOfNanos);
        }
    }

    @Override // defpackage.odj
    public final void b(int i, njs njsVar, njw njwVar) {
        njsVar.getClass();
        yrn yrnVar = (yrn) this.d.remove(Integer.valueOf(i));
        if (yrnVar != null) {
            yrnVar.f();
        } else {
            yrnVar = null;
        }
        if (yrnVar == null) {
            return;
        }
        for (tmn tmnVar : this.b) {
            Duration durationOfNanos = Duration.ofNanos(yrnVar.b());
            durationOfNanos.getClass();
            acjn acjnVar = acjn.a;
            acjm acjmVar = new acjm();
            tmnVar.b(njwVar != null ? njwVar.k() : null);
            acjo.b(acjmVar);
            tmnVar.a("Elements.ImageLoading.Availability.UnfinishedLoadCount", "Elements.ImageLoading.Latency.UnfinishedLoad.DurationInMs", acjo.a(acjmVar), durationOfNanos);
        }
    }

    @Override // defpackage.odj
    public final void c(int i, njs njsVar, njw njwVar, Integer num, int i2) {
        int i3;
        njsVar.getClass();
        yrn yrnVar = (yrn) this.d.remove(Integer.valueOf(i));
        if (yrnVar != null) {
            yrnVar.f();
        } else {
            yrnVar = null;
        }
        if (yrnVar == null) {
            ((zdv) a.c().q("com/google/android/libraries/search/rendering/xuikit/elements/logging/image/XUiKitImagePerfLogger", "onImageLoaded", 59, "XUiKitImagePerfLogger.kt")).u("xUIKit image load success received without a corresponding start signal.");
            return;
        }
        if (i2 == 0) {
            i3 = 1;
        } else {
            int i4 = i2 - 1;
            i3 = i4 != 0 ? (i4 == 2 || i4 == 3) ? 3 : i4 != 4 ? 5 : 2 : 4;
        }
        for (tmn tmnVar : this.b) {
            Duration durationOfNanos = Duration.ofNanos(yrnVar.b());
            durationOfNanos.getClass();
            acjn acjnVar = acjn.a;
            acjm acjmVar = new acjm();
            int i5 = i3 - 1;
            int i6 = i5 != 0 ? (i5 == 1 || i5 == 2) ? 5 : i5 != 3 ? 3 : 4 : 2;
            if ((acjmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acjmVar.y();
            }
            acjn acjnVar2 = (acjn) acjmVar.b;
            acjnVar2.c = i6 - 2;
            acjnVar2.b |= 1;
            tmnVar.b(njwVar != null ? njwVar.k() : null);
            acjo.b(acjmVar);
            int i7 = (num != null && num.intValue() >= 0) ? num.intValue() < 400 ? 3 : num.intValue() < 800 ? 4 : num.intValue() < 1600 ? 5 : num.intValue() < 3200 ? 6 : num.intValue() < 6400 ? 7 : num.intValue() < 12800 ? 8 : num.intValue() < 25600 ? 9 : num.intValue() < 51200 ? 10 : num.intValue() < 102400 ? 11 : num.intValue() < 204800 ? 12 : num.intValue() < 409600 ? 13 : num.intValue() < 819200 ? 14 : num.intValue() < 1638400 ? 15 : num.intValue() < 3276800 ? 16 : num.intValue() < 6553600 ? 17 : 18 : 2;
            if ((acjmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acjmVar.y();
            }
            acjn acjnVar3 = (acjn) acjmVar.b;
            acjnVar3.e = i7 - 2;
            acjnVar3.b |= 4;
            tmnVar.a("Elements.ImageLoading.Availability.SuccessCount", "Elements.ImageLoading.Latency.Success.DurationInMs", acjo.a(acjmVar), durationOfNanos);
        }
    }

    @Override // defpackage.odj
    public final void d(int i, njs njsVar) {
        njsVar.getClass();
        this.d.put(Integer.valueOf(i), yrn.c(this.c));
    }

    @Override // defpackage.odj
    public final void e(njs njsVar) {
        njsVar.getClass();
    }
}
