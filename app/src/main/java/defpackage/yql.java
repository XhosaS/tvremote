package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yql extends yqn {
    final /* synthetic */ String a = "";
    final /* synthetic */ yqn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yql(yqn yqnVar, yqn yqnVar2) {
        super(yqnVar2);
        this.b = yqnVar;
    }

    @Override // defpackage.yqn
    public final CharSequence a(Object obj) {
        return obj == null ? this.a : this.b.a(obj);
    }
}
