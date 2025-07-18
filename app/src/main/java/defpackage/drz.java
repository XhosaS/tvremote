package defpackage;

import com.facebook.litho.TextContent;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class drz implements TextContent {
    final /* synthetic */ List a;

    public drz(List list) {
        this.a = list;
    }

    @Override // com.facebook.litho.TextContent
    public final List getTextItems() {
        return this.a;
    }
}
