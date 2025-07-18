package defpackage;

import android.os.RemoteException;
import com.google.android.katniss.data.PermissionsText;
import com.google.android.katniss.data.UserAssistantSettings;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class lzf implements zxe {
    final /* synthetic */ lzg a;
    final /* synthetic */ int b;
    final /* synthetic */ lzr c;

    public lzf(lzg lzgVar, lzr lzrVar, int i) {
        this.c = lzrVar;
        this.b = i;
        this.a = lzgVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) lzl.a.c()).p(th)).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1$4$1", "onFailure", (char) 485, "AssistantSettingsServicePeer.java")).u("Error receiving GetSettingsUiResponse from server");
        try {
            this.a.a.n(this.c, this.b);
        } catch (RemoteException e) {
            ((zdv) ((zdv) ((zdv) lzl.a.c()).p(e)).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1$4$1", "onFailure", (char) 490, "AssistantSettingsServicePeer.java")).u("Callback Failed.");
        }
    }

    @Override // defpackage.zxe
    public final /* synthetic */ void b(Object obj) {
        Iterator it;
        String str;
        Optional optional = (Optional) obj;
        if (optional == null || optional.isEmpty()) {
            ((zdv) ((zdv) lzl.a.d()).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1$4$1", "onSuccess", 465, "AssistantSettingsServicePeer.java")).u("No GetSettingsUiResponse in result future at this time.");
            return;
        }
        zdy zdyVar = lzl.a;
        ymc ymcVar = (ymc) optional.get();
        yni yniVar = ymcVar.h;
        if (yniVar == null) {
            yniVar = yni.a;
        }
        if ((yniVar.b & 2) != 0) {
            this.a.a.a = yniVar.f;
        }
        try {
            lzr lzrVar = this.c;
            if (this.b - 1 == 0) {
                ArrayList arrayList = new ArrayList();
                yni yniVar2 = ymcVar.h;
                if (yniVar2 == null) {
                    yniVar2 = yni.a;
                }
                ynh ynhVarB = ynh.b(yniVar2.e);
                if (ynhVarB == null) {
                    ynhVarB = ynh.UNSPECIFIED;
                }
                int iOrdinal = ynhVarB.ordinal();
                int i = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? 3 : 2 : 1 : 0;
                ymo ymoVar = yniVar2.c == 3 ? (ymo) yniVar2.d : ymo.a;
                String str2 = ymoVar.b;
                String str3 = ymoVar.c.size() > 0 ? (String) ymoVar.c.get(0) : "";
                String str4 = ymoVar.d;
                String str5 = ymoVar.e.size() > 0 ? (String) ymoVar.e.get(0) : "";
                String str6 = ymoVar.f;
                String str7 = ymoVar.g;
                for (Iterator it2 = ymoVar.h.iterator(); it2.hasNext(); it2 = it) {
                    ymn ymnVar = (ymn) it2.next();
                    String str8 = ymnVar.b;
                    if (ymnVar.c.size() > 0) {
                        it = it2;
                        str = (String) ymnVar.c.get(0);
                    } else {
                        it = it2;
                        str = "";
                    }
                    arrayList.add(new lxr(str8, str, ymnVar.e.size() > 0 ? (String) ymnVar.e.get(0) : "", ymnVar.f));
                }
                lzrVar.e(new PermissionsText(i, str2, str3, str4, str5, str6, str7, arrayList));
                return;
            }
            lxp lxpVar = lxp.a;
            lxl lxlVar = new lxl();
            yni yniVar3 = ymcVar.h;
            if (yniVar3 == null) {
                yniVar3 = yni.a;
            }
            ynh ynhVarB2 = ynh.b(yniVar3.e);
            if (ynhVarB2 == null) {
                ynhVarB2 = ynh.UNSPECIFIED;
            }
            int iOrdinal2 = ynhVarB2.ordinal();
            if (iOrdinal2 == 0) {
                if ((lxlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    lxlVar.y();
                }
                lxp lxpVar2 = (lxp) lxlVar.b;
                lxpVar2.c = 0;
                lxpVar2.b |= 1;
            } else if (iOrdinal2 == 1) {
                if ((lxlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    lxlVar.y();
                }
                lxp lxpVar3 = (lxp) lxlVar.b;
                lxpVar3.c = 1;
                lxpVar3.b |= 1;
            } else if (iOrdinal2 != 2) {
                if ((lxlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    lxlVar.y();
                }
                lxp lxpVar4 = (lxp) lxlVar.b;
                lxpVar4.c = 3;
                lxpVar4.b |= 1;
            } else {
                if ((lxlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    lxlVar.y();
                }
                lxp lxpVar5 = (lxp) lxlVar.b;
                lxpVar5.c = 2;
                lxpVar5.b |= 1;
            }
            ymo ymoVar2 = yniVar3.c == 3 ? (ymo) yniVar3.d : ymo.a;
            String str9 = ymoVar2.b;
            if ((lxlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lxlVar.y();
            }
            lxp lxpVar6 = (lxp) lxlVar.b;
            str9.getClass();
            lxpVar6.b |= 2;
            lxpVar6.d = str9;
            abxs abxsVar = ymoVar2.c;
            if ((lxlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lxlVar.y();
            }
            lxp lxpVar7 = (lxp) lxlVar.b;
            abxs abxsVar2 = lxpVar7.e;
            if (!abxsVar2.c()) {
                int size = abxsVar2.size();
                lxpVar7.e = abxsVar2.d(size + size);
            }
            abus.m(abxsVar, lxpVar7.e);
            String str10 = ymoVar2.d;
            if ((lxlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lxlVar.y();
            }
            lxp lxpVar8 = (lxp) lxlVar.b;
            str10.getClass();
            lxpVar8.b |= 4;
            lxpVar8.f = str10;
            abxs abxsVar3 = ymoVar2.e;
            if ((lxlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lxlVar.y();
            }
            lxp lxpVar9 = (lxp) lxlVar.b;
            abxs abxsVar4 = lxpVar9.g;
            if (!abxsVar4.c()) {
                int size2 = abxsVar4.size();
                lxpVar9.g = abxsVar4.d(size2 + size2);
            }
            abus.m(abxsVar3, lxpVar9.g);
            String str11 = ymoVar2.f;
            if ((lxlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lxlVar.y();
            }
            lxp lxpVar10 = (lxp) lxlVar.b;
            str11.getClass();
            lxpVar10.b |= 8;
            lxpVar10.h = str11;
            String str12 = ymoVar2.g;
            if ((lxlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lxlVar.y();
            }
            lxp lxpVar11 = (lxp) lxlVar.b;
            str12.getClass();
            lxpVar11.b |= 16;
            lxpVar11.i = str12;
            for (ymn ymnVar2 : ymoVar2.h) {
                lxo lxoVar = lxo.a;
                lxn lxnVar = new lxn();
                String str13 = ymnVar2.b;
                if ((lxnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    lxnVar.y();
                }
                lxo lxoVar2 = (lxo) lxnVar.b;
                str13.getClass();
                lxoVar2.b |= 1;
                lxoVar2.c = str13;
                abxs abxsVar5 = ymnVar2.c;
                if ((lxnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    lxnVar.y();
                }
                lxo lxoVar3 = (lxo) lxnVar.b;
                abxs abxsVar6 = lxoVar3.d;
                if (!abxsVar6.c()) {
                    int size3 = abxsVar6.size();
                    lxoVar3.d = abxsVar6.d(size3 + size3);
                }
                abus.m(abxsVar5, lxoVar3.d);
                abxs abxsVar7 = ymnVar2.e;
                if ((lxnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    lxnVar.y();
                }
                lxo lxoVar4 = (lxo) lxnVar.b;
                abxs abxsVar8 = lxoVar4.e;
                if (!abxsVar8.c()) {
                    int size4 = abxsVar8.size();
                    lxoVar4.e = abxsVar8.d(size4 + size4);
                }
                abus.m(abxsVar7, lxoVar4.e);
                String str14 = ymnVar2.f;
                if ((lxnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    lxnVar.y();
                }
                lxo lxoVar5 = (lxo) lxnVar.b;
                str14.getClass();
                lxoVar5.b |= 2;
                lxoVar5.f = str14;
                lxo lxoVar6 = (lxo) lxnVar.v();
                if ((lxlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    lxlVar.y();
                }
                lxp lxpVar12 = (lxp) lxlVar.b;
                lxoVar6.getClass();
                abxs abxsVar9 = lxpVar12.j;
                if (!abxsVar9.c()) {
                    int size5 = abxsVar9.size();
                    lxpVar12.j = abxsVar9.d(size5 + size5);
                }
                lxpVar12.j.add(lxoVar6);
            }
            yhs yhsVar = ymcVar.f;
            if (yhsVar == null) {
                yhsVar = yhs.a;
            }
            boolean z = yhsVar.b;
            if ((lxlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lxlVar.y();
            }
            lxp lxpVar13 = (lxp) lxlVar.b;
            lxpVar13.b |= 32;
            lxpVar13.k = z;
            lzrVar.f(new UserAssistantSettings((lxp) lxlVar.v()));
        } catch (RemoteException e) {
            ((zdv) ((zdv) ((zdv) lzl.a.c()).p(e)).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1$4$1", "onSuccess", (char) 479, "AssistantSettingsServicePeer.java")).u("Callback Failed.");
        }
    }
}
