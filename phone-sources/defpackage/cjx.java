package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjx extends cri {
    final /* synthetic */ yoe a;
    final /* synthetic */ cil b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjx(yoe yoeVar, cil cilVar) {
        super(null);
        this.a = yoeVar;
        this.b = cilVar;
    }

    @Override // defpackage.cri
    public final void a(int i) {
        StringBuilder sb = new StringBuilder("Failed to load ");
        sb.append(this.b);
        sb.append(" (reason=");
        sb.append(i);
        sb.append(", ");
        String str = i != -3 ? i != -2 ? i != -1 ? i != 1 ? i != 2 ? i != 3 ? "Unknown error code" : "The given query was not supported by this provider." : "The provider found the queried font, but it is currently unavailable." : "Font not found, please check availability on GoogleFont.Provider.AllFontsList: https://fonts.gstatic.com/s/a/directory.xml" : "The requested provider was not found on this device." : "The given provider cannot be authenticated with the certificates given." : "Generic error loading font, for example variation settings were not parsable";
        yoe yoeVar = this.a;
        sb.append(str);
        sb.append(')');
        yoeVar.e(new IllegalStateException(sb.toString()));
    }

    @Override // defpackage.cri
    public final void b(Typeface typeface) {
        this.a.resumeWith(typeface);
    }
}
