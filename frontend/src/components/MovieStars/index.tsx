import { ReactComponent as StarFull } from 'assets/images/StarFull.svg';
import { ReactComponent as StarHalf } from 'assets/images/StarHalf.svg';
import { ReactComponent as StarEmpty } from 'assets/images/StarEmpty.svg';

import './styles.css';

function MovieStars() {
    return(
        <div className="dsmovie-stars-container">
  <StarFull />
  <StarFull />
  <StarFull />
  <StarHalf />
  <StarEmpty />
</div>
    );
}

export default MovieStars;