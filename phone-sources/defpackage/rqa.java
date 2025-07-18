package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rqa {
    public final String a;
    public final boolean b;
    public final zba c;
    public final yzi d;
    public final String e;
    public final Long f;
    public final boolean g;
    public final rrr h;
    public final boolean i;
    public final int j;
    public final rog k;
    public final int l;
    private final Predicate m;

    public rqa() {
        throw null;
    }

    public static rpz a() {
        rpz rpzVar = new rpz();
        rpzVar.c(false);
        rpzVar.d(false);
        rpzVar.b(0);
        rpzVar.g(false);
        rpzVar.e(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        rpzVar.f = new pbd(4);
        return rpzVar;
    }

    public final boolean equals(Object obj) {
        yzi yziVar;
        String str;
        Long l;
        rog rogVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rqa) {
            rqa rqaVar = (rqa) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(rqaVar.a) : rqaVar.a == null) {
                if (this.b == rqaVar.b && this.c.equals(rqaVar.c) && ((yziVar = this.d) != null ? yziVar.equals(rqaVar.d) : rqaVar.d == null) && ((str = this.e) != null ? str.equals(rqaVar.e) : rqaVar.e == null) && ((l = this.f) != null ? l.equals(rqaVar.f) : rqaVar.f == null) && this.g == rqaVar.g) {
                    if (this.h != null) {
                        rrr rrrVar = rqaVar.h;
                        throw null;
                    }
                    if (rqaVar.h == null && this.i == rqaVar.i && this.j == rqaVar.j && this.m.equals(rqaVar.m) && ((rogVar = this.k) != null ? rogVar.equals(rqaVar.k) : rqaVar.k == null) && this.l == rqaVar.l) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        String str = this.a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        zba zbaVar = this.c;
        if (zbaVar.A()) {
            iJ = zbaVar.j();
        } else {
            int iJ3 = zbaVar.M;
            if (iJ3 == 0) {
                iJ3 = zbaVar.j();
                zbaVar.M = iJ3;
            }
            iJ = iJ3;
        }
        int i = (iHashCode ^ iJ) * 1000003;
        yzi yziVar = this.d;
        if (yziVar == null) {
            iJ2 = 0;
        } else if (yziVar.A()) {
            iJ2 = yziVar.j();
        } else {
            int iJ4 = yziVar.M;
            if (iJ4 == 0) {
                iJ4 = yziVar.j();
                yziVar.M = iJ4;
            }
            iJ2 = iJ4;
        }
        int i2 = (i ^ iJ2) * 1000003;
        String str2 = this.e;
        int iHashCode2 = (i2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l = this.f;
        int iHashCode3 = (iHashCode2 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        int i3 = true != this.g ? 1237 : 1231;
        if (this.h != null) {
            throw null;
        }
        int iHashCode4 = (((((((iHashCode3 ^ i3) * (-721379959)) ^ (true == this.i ? 1231 : 1237)) * 1000003) ^ this.j) * 1000003) ^ this.m.hashCode()) * 1000003;
        rog rogVar = this.k;
        return ((iHashCode4 ^ (rogVar != null ? rogVar.hashCode() : 0)) * 1000003) ^ this.l;
    }

    public final String toString() {
        rog rogVar = this.k;
        Predicate predicate = this.m;
        rrr rrrVar = this.h;
        yzi yziVar = this.d;
        return "Metric{customEventName=" + this.a + ", isEventNameConstant=" + this.b + ", metric=" + String.valueOf(this.c) + ", metricExtension=" + String.valueOf(yziVar) + ", accountableComponentName=" + this.e + ", sampleRatePermille=" + this.f + ", isUnsampled=" + this.g + ", activeCuiId=" + String.valueOf(rrrVar) + ", shouldAttachActiveTraces=" + this.i + ", maxActiveTraces=" + this.j + ", activeTracePredicate=" + String.valueOf(predicate) + ", debugLogsTime=" + String.valueOf(rogVar) + ", debugLogsSize=" + this.l + "}";
    }

    public rqa(String str, boolean z, zba zbaVar, yzi yziVar, String str2, Long l, boolean z2, rrr rrrVar, boolean z3, int i, Predicate predicate, rog rogVar, int i2) {
        this.a = str;
        this.b = z;
        this.c = zbaVar;
        this.d = yziVar;
        this.e = str2;
        this.f = l;
        this.g = z2;
        this.h = rrrVar;
        this.i = z3;
        this.j = i;
        this.m = predicate;
        this.k = rogVar;
        this.l = i2;
    }
}
