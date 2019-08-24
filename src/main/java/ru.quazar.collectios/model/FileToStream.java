package main.java.ru.quazar.l05.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

/**
 * Model IoStream witch links controller with services, repositories.
 *
 * @version $Id: IoStream.java,v 1.0 2019-08-20 23:30:42 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 */

@Data
@NoAutoArgsConstructor
@NoArgsConstructor
@Entity
class IoStream<T extends Number> {

    @Id
    @GeneratedValue
    private List< T > list = new ArrayList<>();
}
