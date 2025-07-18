package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface lsl extends IInterface {
    void c(Status status);

    void d(Status status, DogfoodsToken dogfoodsToken);

    void e(Status status);

    void f(Status status, ExperimentTokens experimentTokens);

    void g(Status status, Configurations configurations);

    void h(Status status, Configurations configurations);

    void i(Status status, Flag flag);

    void j(Status status, long j);

    void k(Status status, FlagOverrides flagOverrides);

    void l(Status status);

    void m(Status status);

    void n(Status status);

    void o(Status status);

    void p(Status status);

    void q(Status status);

    void r(Status status);
}
