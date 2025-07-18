package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vrv extends agtu implements agvb {
    final /* synthetic */ vrz a;
    final /* synthetic */ Uri b;
    final /* synthetic */ ContentValues[] c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrv(agsw agswVar, vrz vrzVar, Uri uri, ContentValues[] contentValuesArr) {
        super(2, agswVar);
        this.a = vrzVar;
        this.b = uri;
        this.c = contentValuesArr;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vrv) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        final Uri uri = this.b;
        final ContentValues[] contentValuesArr = this.c;
        return new Integer(((Integer) this.a.b.b(uri, new vsu() { // from class: vsf
            @Override // defpackage.vsu
            public final Object a(ContentProviderClient contentProviderClient) {
                return Integer.valueOf(contentProviderClient.bulkInsert(uri, contentValuesArr));
            }
        })).intValue());
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        vrv vrvVar = new vrv(agswVar, this.a, this.b, this.c);
        vrvVar.d = obj;
        return vrvVar;
    }
}
