package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mcp implements tsv {
    private final /* synthetic */ int a;

    public /* synthetic */ mcp(int i) {
        this.a = i;
    }

    @Override // defpackage.tsv
    public final boolean apply(Object obj) {
        switch (this.a) {
            case 0:
                return "upload_wishlist_v2".equals((String) obj);
            case 1:
                return !((xbj) obj).g.isEmpty();
            case 2:
                return ((lwp) obj).b.m();
            case 3:
                ((vrn) obj).getClass();
                return false;
            case 4:
                ofi ofiVar = ((qva) obj).b;
                return ofiVar.g && !ofiVar.h;
            case 5:
                return !TextUtils.isEmpty((String) obj);
            case 6:
                return ((shu) obj).c;
            case 7:
                return !((shu) obj).c;
            default:
                return ((shu) obj).b;
        }
    }
}
