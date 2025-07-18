package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.SystemClock;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
class apu {
    final /* synthetic */ aqa a;

    public apu(aqa aqaVar) {
        this.a = aqaVar;
    }

    final void a() {
        aqa aqaVar;
        ArrayList arrayList;
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        int i = 0;
        while (true) {
            aqaVar = this.a;
            arrayList = aqaVar.b;
            if (i >= arrayList.size()) {
                break;
            }
            apv apvVar = (apv) arrayList.get(i);
            if (apvVar != null) {
                wx wxVar = aqaVar.a;
                Long l = (Long) wxVar.get(apvVar);
                if (l == null) {
                    apvVar.a(jUptimeMillis);
                } else if (l.longValue() < jUptimeMillis2) {
                    wxVar.remove(apvVar);
                    apvVar.a(jUptimeMillis);
                }
            }
            i++;
        }
        if (aqaVar.e) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                apx apxVar = aqaVar.h;
                ValueAnimator.unregisterDurationScaleChangeListener(apxVar.a);
                apxVar.a = null;
            }
            aqaVar.e = false;
        }
        if (arrayList.size() > 0) {
            aqaVar.g.a(aqaVar.d);
        }
    }
}
