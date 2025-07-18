package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
class mwp extends Observer {
    final /* synthetic */ agfp a;
    final /* synthetic */ String b;

    public mwp(agfp agfpVar, String str) {
        this.a = agfpVar;
        this.b = str;
    }

    @Override // com.google.android.libraries.elements.interfaces.Observer
    public final Status storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord) {
        this.a.b(yqt.h(transactionRecord.endState().find(this.b)));
        return Status.OK;
    }
}
