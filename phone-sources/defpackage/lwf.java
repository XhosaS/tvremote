package defpackage;

import java.io.InputStream;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lwf extends lfd {
    @Override // defpackage.lfd
    protected final ObjectInputStream c(InputStream inputStream) {
        mec mecVar = new mec(inputStream);
        mecVar.a("com.google.android.videos.tagging.DefaultKnowledgeRequesters$TagStreamHttpResponse", lxa.class);
        mecVar.a("com.google.android.videos.service.tagging.DefaultKnowledgeRequesters$TagStreamHttpResponse", lxa.class);
        mecVar.a("com.google.android.videos.service.tagging.TagStreamHttpResponse", lwz.class);
        mecVar.a("com.google.android.videos.service.tagging.TagStreamHttpResponse", lxa.class);
        return mecVar;
    }
}
