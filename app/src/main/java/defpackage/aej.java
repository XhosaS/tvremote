package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aej implements afe {
    final /* synthetic */ String a;

    public aej(String str) {
        this.a = str;
    }

    @Override // defpackage.afe
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(aek aekVar) {
        synchronized (ael.c) {
            wx wxVar = ael.d;
            String str = this.a;
            ArrayList arrayList = (ArrayList) wxVar.get(str);
            if (arrayList == null) {
                return;
            }
            wxVar.remove(str);
            for (int i = 0; i < arrayList.size(); i++) {
                ((afe) arrayList.get(i)).accept(aekVar);
            }
        }
    }
}
