package defpackage;

import android.content.Context;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.play.movies.common.presenter.activity.AuxiliaryActivity;
import com.google.android.apps.play.movies.common.service.pinning.TransferService;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class csl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ csl(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.function.IntConsumer] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, rim] */
    /* JADX WARN: Type inference failed for: r1v8, types: [els, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, qvh] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                ((csm) this.b).m339xb24343b7(this.a);
                return;
            case 1:
                this.b.accept(this.a);
                return;
            case 2:
                ((cri) this.b).a(this.a);
                return;
            case 3:
                ((ebp) this.b).a.onAudioFocusChange(this.a);
                return;
            case 4:
                String str = edt.a;
                ((dwi) this.b).a.d(this.a);
                return;
            case 5:
                fux fuxVar = ((ftt) this.b).b.c.d;
                if (fuxVar != null) {
                    fuxVar.l(this.a);
                    return;
                }
                return;
            case 6:
                fux fuxVar2 = ((ftt) this.b).b.c.d;
                if (fuxVar2 != null) {
                    fuxVar2.m(this.a);
                    return;
                }
                return;
            case 7:
                AuxiliaryActivity.$r8$lambda$XjBYy1K55Jq7jmh5Trdx0Dr0BDE((AuxiliaryActivity) this.b, this.a);
                return;
            case 8:
                Object obj = this.b;
                TransferService transferService = (TransferService) obj;
                if (this.a < transferService.c || !transferService.stopSelfResult(transferService.b)) {
                    return;
                }
                TransferService.Receiver.a((Context) obj, false);
                return;
            case 9:
                ((TwoStatePreference) this.b).k(this.a == 3);
                return;
            case 10:
                nkz nkzVar = (nkz) this.b;
                nla nlaVar = nkzVar.a;
                nlaVar.l = -1;
                nlaVar.m = -1;
                nlaVar.h = null;
                nlaVar.i = null;
                nlaVar.j = 0.0d;
                nlaVar.k();
                nlaVar.k = false;
                nlaVar.n = null;
                nlaVar.s = 1;
                int i = this.a;
                List list = nlaVar.r;
                synchronized (list) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((jys) it.next()).G(i);
                    }
                }
                nla nlaVar2 = nkzVar.a;
                nlaVar2.f();
                nlaVar2.l(nlaVar2.b);
                return;
            case 11:
                int i2 = this.a;
                Object obj2 = this.b;
                if (i2 == 0) {
                    nla nlaVar3 = ((nkz) obj2).a;
                    nlaVar3.s = 3;
                    nlaVar3.c = true;
                    nlaVar3.d = true;
                    List list2 = nlaVar3.r;
                    synchronized (list2) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            ((jys) it2.next()).D();
                        }
                    }
                    return;
                }
                nkz nkzVar2 = (nkz) obj2;
                nla nlaVar4 = nkzVar2.a;
                nlaVar4.s = 1;
                List list3 = nlaVar4.r;
                synchronized (list3) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        ((jys) it3.next()).E(i2);
                    }
                }
                nkzVar2.a.f();
                return;
            case 12:
                ((nkz) this.b).a.v.I(this.a);
                return;
            case 13:
                nla nlaVar5 = ((nkz) this.b).a;
                nlaVar5.s = 4;
                int i3 = this.a;
                List list4 = nlaVar5.r;
                synchronized (list4) {
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        ((jys) it4.next()).F(i3);
                    }
                }
                return;
            case 14:
                ((nrs) this.b).s.I(this.a);
                return;
            case 15:
                ((nzd) this.b).j(this.a);
                return;
            case 16:
                aafi aafiVar = (aafi) this.b;
                ?? r1 = aafiVar.b;
                Object objA = aafiVar.c.a();
                vuc vucVar = (vuc) aafiVar.a;
                vtw vtwVar = (vtw) vucVar.a(5, null);
                vtwVar.x(vucVar);
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                int i4 = this.a;
                wds wdsVar = (wds) vtwVar.b;
                wds wdsVar2 = wds.a;
                wdsVar.c = i4 - 1;
                wdsVar.b |= 1;
                r1.a(objA, (wds) vtwVar.r());
                return;
            case 17:
                ((rtx) this.b).b(this.a + 1);
                return;
            case 18:
                ((svw) this.b).J(this.a);
                return;
            case 19:
                int i5 = this.a;
                ((tkb) ((zft) this.b).a).b.i(new Exception("PairingResult: ".concat(i5 != 2 ? i5 != 3 ? "FAILED_SECRET" : "FAILED_CANCELED" : "FAILED_CONNECTION")));
                return;
            default:
                ((usy) this.b).b().e(this.a);
                return;
        }
    }

    public csl(Object obj, int i, int i2, byte[] bArr) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    public csl(Object obj, int i, int i2, char[] cArr) {
        this.c = i2;
        this.a = i;
        this.b = obj;
    }
}
