package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yti extends ytj implements ysm {
    private static final long serialVersionUID = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yti(ysh yshVar, ysk yskVar) {
        super(new yug(yshVar, yskVar));
        yskVar.getClass();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use LoadingSerializationProxy");
    }

    public final Object a(Object obj) {
        try {
            yug yugVar = this.a;
            return yugVar.d(obj, yugVar.r);
        } catch (ExecutionException e) {
            throw new zzd(e.getCause());
        }
    }

    @Override // defpackage.yqi
    public final Object apply(Object obj) {
        return a(obj);
    }

    @Override // defpackage.ytj
    Object writeReplace() {
        return new ytg(this.a);
    }
}
