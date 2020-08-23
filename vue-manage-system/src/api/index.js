import request from '../utils/request';

export const fetchData = query => {
    return request({
        url: '/eth/selectAll',
        method: 'get',
        params: query
    });
};
