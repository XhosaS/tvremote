package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jak implements yjk {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ jak(bia biaVar, bii biiVar, bie bieVar, String str, Object obj, Object[] objArr, int i) {
        this.g = i;
        this.c = biaVar;
        this.d = biiVar;
        this.b = bieVar;
        this.a = str;
        this.e = obj;
        this.f = objArr;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [bie, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [bii, java.lang.Object] */
    @Override // defpackage.yjk
    public final Object a() {
        boolean z;
        int i = this.g;
        if (i == 0) {
            Object obj = this.f;
            Object obj2 = this.e;
            ((jan) this.b).p((Context) this.c, (wll) this.d, this.a, (wpm) obj2, (String) obj, false);
            return ygi.a;
        }
        boolean z2 = true;
        if (i != 1) {
            Object obj3 = this.f;
            Object obj4 = this.e;
            ((jan) this.b).o((Context) this.c, (wll) this.d, this.a, (wpm) obj4, (String) obj3, false);
            return ygi.a;
        }
        bia biaVar = (bia) this.c;
        bie bieVar = biaVar.b;
        ?? r3 = this.b;
        if (bieVar != r3) {
            biaVar.b = r3;
            z = true;
        } else {
            z = false;
        }
        String str = this.a;
        if (yks.e(biaVar.c, str)) {
            z2 = z;
        } else {
            biaVar.c = str;
        }
        Object obj5 = this.f;
        Object obj6 = this.e;
        biaVar.a = this.d;
        biaVar.d = obj6;
        biaVar.e = (Object[]) obj5;
        gmz gmzVar = biaVar.f;
        if (gmzVar != null && z2) {
            gmzVar.b();
            biaVar.f = null;
            biaVar.d();
        }
        return ygi.a;
    }

    public /* synthetic */ jak(jan janVar, Context context, wll wllVar, String str, wpm wpmVar, String str2, int i) {
        this.g = i;
        this.b = janVar;
        this.c = context;
        this.d = wllVar;
        this.a = str;
        this.e = wpmVar;
        this.f = str2;
    }
}
