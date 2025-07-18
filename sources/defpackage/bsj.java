package defpackage;

import android.content.Context;
import com.google.android.tv.remote.service.R;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsj implements cpi {
    private final cpm a;
    private final cpm b;
    private final /* synthetic */ int c;

    public bsj(cpm cpmVar, cpm cpmVar2, int i) {
        this.c = i;
        this.a = cpmVar;
        this.b = cpmVar2;
    }

    @Override // defpackage.crv, defpackage.cru
    public final /* synthetic */ Object a() {
        switch (this.c) {
            case 0:
                return new bsi((Context) ((cpj) this.a).a, ((Boolean) this.b.a()).booleanValue());
            case 1:
                return new brj((Context) ((cpj) this.b).a, ((brq) this.a).a());
            case 2:
                bsi bsiVar = (bsi) this.a.a();
                Set setB = ((cpo) this.b).a();
                bsz bszVar = new bsz(bsiVar);
                Iterator it = setB.iterator();
                while (it.hasNext()) {
                    bszVar.b.add((bta) it.next());
                }
                return bszVar;
            case 3:
                return Boolean.valueOf(((buj) this.b).a().f("disable_bt_discoverable", ((Context) ((cpj) this.a).a).getResources().getBoolean(R.bool.disable_bt_advertising)));
            case 4:
                return Boolean.valueOf(((buj) this.b).a().f("disable_bt", ((Context) ((cpj) this.a).a).getResources().getBoolean(R.bool.disable_bt)));
            case 5:
                return Boolean.valueOf(((buj) this.b).a().f("disable_le_advertising", ((Context) ((cpj) this.a).a).getResources().getBoolean(R.bool.disable_le_advertising)));
            case 6:
                return Boolean.valueOf(((buj) this.b).a().f("force_htt", ((Context) ((cpj) this.a).a).getPackageManager().hasSystemFeature("com.google.android.feature.GLOBAL_ASSIST_TRIGGERING")));
            case 7:
                Context context = (Context) ((cpj) this.a).a;
                return Boolean.valueOf(((buj) this.b).a().f("hold_to_talk", context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE") || context.getResources().getBoolean(R.bool.hold_to_talk)));
            case 8:
                return Boolean.valueOf(((Boolean) this.a.a()).booleanValue() || ((buj) this.b).a().f("push_to_talk", true));
            default:
                return new cjz(((cjy) this.a).a(), (byg) ((cpj) this.b).a);
        }
    }

    public bsj(cpm cpmVar, cpm cpmVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = cpmVar;
        this.a = cpmVar2;
    }
}
