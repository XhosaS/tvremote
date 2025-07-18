package defpackage;

import android.content.Intent;
import com.google.common.collect.ImmutableList;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvs {
    public final int a;
    public final String b;
    public final qen c;
    public final pvq d;
    public final List e;
    public final vmo f;
    public final Intent g;
    public final qrd h;
    public final boolean i;
    public final pvu j;
    public final int k;
    private final vks l;

    public pvs() {
        throw null;
    }

    public static pvr a() {
        pvr pvrVar = new pvr();
        pvrVar.g(new ArrayList());
        pvrVar.d(vmo.a);
        pvrVar.c(qrd.a);
        pvp pvpVar = new pvp();
        pvpVar.b(vht.REMOVE_REASON_UNKNOWN);
        pvrVar.f = pvpVar.a();
        pvrVar.b(false);
        return pvrVar;
    }

    public final ImmutableList b() {
        pvq pvqVar = this.d;
        sij.s(pvqVar == pvq.a, "Can't get system tray threads as threads in this event are from type %s", pvqVar);
        return (ImmutableList) Collection.EL.stream(this.e).map(new nrc(4)).collect(ImmutableList.toImmutableList());
    }

    public final boolean equals(Object obj) {
        String str;
        qen qenVar;
        Intent intent;
        vks vksVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pvs)) {
            return false;
        }
        pvs pvsVar = (pvs) obj;
        int i = this.k;
        int i2 = pvsVar.k;
        if (i != 0) {
            return i2 == 1 && this.a == pvsVar.a && ((str = this.b) != null ? str.equals(pvsVar.b) : pvsVar.b == null) && ((qenVar = this.c) != null ? qenVar.equals(pvsVar.c) : pvsVar.c == null) && this.d.equals(pvsVar.d) && this.e.equals(pvsVar.e) && this.f.equals(pvsVar.f) && ((intent = this.g) != null ? intent.equals(pvsVar.g) : pvsVar.g == null) && this.h.equals(pvsVar.h) && ((vksVar = this.l) != null ? vksVar.equals(pvsVar.l) : pvsVar.l == null) && this.i == pvsVar.i && this.j.equals(pvsVar.j);
        }
        throw null;
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        a.bl(this.k);
        String str = this.b;
        int iJ3 = 0;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.a;
        qen qenVar = this.c;
        int iHashCode2 = ((((((iHashCode ^ ((i ^ (-722379962)) * 1000003)) * 1000003) ^ (qenVar == null ? 0 : qenVar.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        vmo vmoVar = this.f;
        if (vmoVar.A()) {
            iJ = vmoVar.j();
        } else {
            int iJ4 = vmoVar.M;
            if (iJ4 == 0) {
                iJ4 = vmoVar.j();
                vmoVar.M = iJ4;
            }
            iJ = iJ4;
        }
        int i2 = ((iHashCode2 * 1000003) ^ iJ) * 1000003;
        Intent intent = this.g;
        int iHashCode3 = (i2 ^ (intent == null ? 0 : intent.hashCode())) * 1000003;
        qrd qrdVar = this.h;
        if (qrdVar.A()) {
            iJ2 = qrdVar.j();
        } else {
            int iJ5 = qrdVar.M;
            if (iJ5 == 0) {
                iJ5 = qrdVar.j();
                qrdVar.M = iJ5;
            }
            iJ2 = iJ5;
        }
        int i3 = (iHashCode3 ^ iJ2) * 1000003;
        vks vksVar = this.l;
        if (vksVar != null) {
            if (vksVar.A()) {
                iJ3 = vksVar.j();
            } else {
                iJ3 = vksVar.M;
                if (iJ3 == 0) {
                    iJ3 = vksVar.j();
                    vksVar.M = iJ3;
                }
            }
        }
        return ((((i3 ^ iJ3) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ this.j.hashCode();
    }

    public final String toString() {
        String str = this.k != 1 ? "null" : "SYSTEM_TRAY";
        int i = this.a;
        String str2 = this.b;
        qen qenVar = this.c;
        pvq pvqVar = this.d;
        List list = this.e;
        vmo vmoVar = this.f;
        Intent intent = this.g;
        qrd qrdVar = this.h;
        vks vksVar = this.l;
        boolean z = this.i;
        pvu pvuVar = this.j;
        return "NotificationEvent{source=" + str + ", type=" + i + ", actionId=" + str2 + ", account=" + String.valueOf(qenVar) + ", eventThreadType=" + String.valueOf(pvqVar) + ", threads=" + String.valueOf(list) + ", threadStateUpdate=" + String.valueOf(vmoVar) + ", intent=" + String.valueOf(intent) + ", localThreadState=" + String.valueOf(qrdVar) + ", action=" + String.valueOf(vksVar) + ", activityLaunched=" + z + ", removalInfo=" + String.valueOf(pvuVar) + "}";
    }

    public pvs(int i, String str, qen qenVar, pvq pvqVar, List list, vmo vmoVar, Intent intent, qrd qrdVar, vks vksVar, boolean z, pvu pvuVar) {
        this.k = 1;
        this.a = i;
        this.b = str;
        this.c = qenVar;
        this.d = pvqVar;
        this.e = list;
        this.f = vmoVar;
        this.g = intent;
        this.h = qrdVar;
        this.l = vksVar;
        this.i = z;
        this.j = pvuVar;
    }
}
