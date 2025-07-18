package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class vme implements zvi {
    public final /* synthetic */ vmn a;

    public /* synthetic */ vme(vmn vmnVar) {
        this.a = vmnVar;
    }

    @Override // defpackage.zvi
    public final zyd a(Object obj) {
        ArrayList arrayList = new ArrayList();
        zdl it = ((yyr) obj).entrySet().iterator();
        while (it.hasNext()) {
            vmn vmnVar = this.a;
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(vmnVar.o((AccountId) entry.getKey(), (von) entry.getValue()));
        }
        return zxn.c(arrayList).a(new zvk(), zwk.a);
    }
}
