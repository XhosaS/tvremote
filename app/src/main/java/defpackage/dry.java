package defpackage;

import android.widget.TextView;
import com.facebook.litho.TextContent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class dry implements TextContent {
    final /* synthetic */ Object a;

    public dry(Object obj) {
        this.a = obj;
    }

    @Override // com.facebook.litho.TextContent
    public final List getTextItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((TextView) this.a).getText());
        return arrayList;
    }
}
