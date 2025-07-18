package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vrx extends agtu implements agvb {
    final /* synthetic */ vrz a;
    final /* synthetic */ Uri b;
    final /* synthetic */ ContentValues c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrx(agsw agswVar, vrz vrzVar, Uri uri, ContentValues contentValues) {
        super(2, agswVar);
        this.a = vrzVar;
        this.b = uri;
        this.c = contentValues;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vrx) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        final Uri uri = this.b;
        final ContentValues contentValues = this.c;
        return (Uri) this.a.b.b(uri, new vsu() { // from class: vsj
            @Override // defpackage.vsu
            public final Object a(ContentProviderClient contentProviderClient) {
                return contentProviderClient.insert(uri, contentValues);
            }
        });
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        vrx vrxVar = new vrx(agswVar, this.a, this.b, this.c);
        vrxVar.d = obj;
        return vrxVar;
    }
}
