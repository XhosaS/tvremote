package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aeiu extends ContextWrapper {
    public bq a;
    public LayoutInflater b;
    public LayoutInflater c;
    private final bcj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeiu(Context context, bq bqVar) {
        super(context);
        context.getClass();
        aeit aeitVar = new aeit(this);
        this.d = aeitVar;
        this.b = null;
        this.a = bqVar;
        bqVar.ek().b(aeitVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            if (this.b == null) {
                this.b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.c = this.b.cloneInContext(this);
        }
        return this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public aeiu(LayoutInflater layoutInflater, bq bqVar) {
        Context context;
        if (layoutInflater != null && (context = layoutInflater.getContext()) != null) {
            super(context);
            aeit aeitVar = new aeit(this);
            this.d = aeitVar;
            this.b = layoutInflater;
            this.a = bqVar;
            bqVar.ek().b(aeitVar);
            return;
        }
        throw null;
    }
}
