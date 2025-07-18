package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uur extends twx {
    private final ImmutableList a;

    public uur(String str, ImmutableList immutableList) {
        super(str);
        this.a = immutableList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tvw
    public final void c(tvu tvuVar) {
        ImmutableList immutableList = this.a;
        int size = immutableList.size();
        for (int i = 0; i < size; i++) {
            tvw tvwVar = (tvw) immutableList.get(i);
            if (tvuVar.J() || tvwVar.d(tvuVar.p())) {
                tvwVar.c(tvuVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tvw
    public final boolean d(Level level) {
        ImmutableList immutableList = this.a;
        int size = immutableList.size();
        for (int i = 0; i < size; i++) {
            if (((tvw) immutableList.get(i)).d(level)) {
                return true;
            }
        }
        return false;
    }
}
