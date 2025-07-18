package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eun implements ezz {
    private final ezz a;
    private final List b;

    public eun(ezz ezzVar, List list) {
        this.a = ezzVar;
        this.b = list;
    }

    @Override // defpackage.ezz
    public final /* bridge */ /* synthetic */ Object a(Uri uri, InputStream inputStream) {
        eum eumVar = (eum) this.a.a(uri, inputStream);
        List list = this.b;
        return (list == null || list.isEmpty()) ? eumVar : (eum) eumVar.e(list);
    }
}
