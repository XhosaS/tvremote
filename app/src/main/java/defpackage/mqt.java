package defpackage;

import com.google.android.libraries.elements.interfaces.DataSourceListener;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mqt extends mqs {
    private final List a = new ArrayList();

    @Override // defpackage.mqs
    public final void a(DataSourceListener dataSourceListener) {
        this.a.add(dataSourceListener);
    }

    @Override // defpackage.mqs
    public final void b() {
        this.a.clear();
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceListener
    public final Status onDataChanged() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((DataSourceListener) it.next()).onDataChanged();
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceListener
    public final Status onError(Status status) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((DataSourceListener) it.next()).onError(status);
        }
        return Status.OK;
    }
}
