package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ner implements nfd {
    public final nes a;
    public final nem b;
    public final Map c;
    public final ArrayList d = new ArrayList();

    public ner(Map map, nes nesVar, nem nemVar) {
        this.c = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.a = nesVar;
        this.b = nemVar;
    }

    @Override // defpackage.nfd
    public final void a(Uri uri, String str, boolean z) {
        this.b.a(0L, new neq(this, uri, str, z));
    }
}
