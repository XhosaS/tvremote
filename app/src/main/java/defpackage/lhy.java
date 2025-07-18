package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class lhy implements lad {
    final /* synthetic */ String a;
    final /* synthetic */ List b;
    final /* synthetic */ lih c;

    public lhy(lih lihVar, String str, List list) {
        this.a = str;
        this.b = list;
        this.c = lihVar;
    }

    @Override // defpackage.lad
    public final void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.c.I(true, i, th, bArr, this.a, this.b);
    }
}
