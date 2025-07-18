package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zgg implements zgc {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zgc
    public final /* synthetic */ void a(zer zerVar, Iterator it, Object obj) {
        ziu.b(zerVar.c, "non repeating key");
        if (!zerVar.d || zgr.a() <= 20) {
            zerVar.a(it, obj);
        } else {
            while (it.hasNext()) {
                obj.a(zerVar.a, it.next());
            }
        }
    }
}
